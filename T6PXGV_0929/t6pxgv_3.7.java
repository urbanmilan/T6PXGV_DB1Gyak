package talibe;

import java.io.*;

public class Asd {
	
	public static void main(String[] args) {	
		h4();
		h5();
	}
	
	public static class Auto implements Serializable
	{
		private static final long serialVersionUID = 1L;
		String rendszam;
		String tipus;
		int ar;
		
		public Auto (String r, String t, int a)
		{
			this.rendszam = r;
			this.tipus = t;
			this.ar = a;
		}
	}
	
	public static void h4()
	{
		Auto[] a = { new Auto("R11","Opel",333) , new Auto("R12","Fiat",233) , new Auto("R14","Skoda",364) };
		
		try
		{
			ObjectOutputStream ki = new ObjectOutputStream( new FileOutputStream("Auto.dat") );
			
			for (Auto auto : a)
			{
				ki.writeObject(auto);
			}
			
			ki.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("File hiba!");
		}
		
		System.out.println("K�sz");
	}
	
	public static void h5()
	{
		Auto ma;
		
		try
		{
			File nf =  new File("Autok.dat");
			
			if(nf.exists())
			{
				@SuppressWarnings("resource")
				ObjectInputStream ki = new ObjectInputStream( new FileInputStream("Autok.dat") );
				
				try
				{
					while(true)
					{
						ma = (Auto) ki.readObject();
						
						if(ma.ar > 300)
						{
							System.out.println("rendsz�m: " + ma.rendszam);
						}
					}
				}
				catch(EOFException f)
				{
					ma = null;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("K�sz");
	}
}