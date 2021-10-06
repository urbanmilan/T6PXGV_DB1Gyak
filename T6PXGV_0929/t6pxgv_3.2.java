package talibe;

import java.io.*;
import java.util.*;

public class Asd {

	public static void main(String[] args) {
		List<Integer> kiir = new ArrayList<>();
		
		int ossze = 0;
		int db = 0;
		int seged = 0;
		
		System.out.println("Adja meg h�ny adatott szeretne beolvasni");
		Scanner in = new Scanner(System.in);
		db = in.nextInt();
		
		for (int i = 0; i < db; i++) 
		{
			System.out.println("Adja meg az " + i + " sz�mot: ");
			
			seged = in.nextInt();

			ossze += seged;
			
			kiir.add(seged);
		}
		
		kiir.add(ossze);
		in.close();
		
		System.out.println("A be�rt sz�mok �sszege: " + ossze);
		
		FileWriter fw;
		try 
		{
			fw = new FileWriter("Urban.txt");
			
			for (Integer i : kiir) 
			{
				fw.write(i + System.lineSeparator());
			}
			
			fw.close();
			
			System.out.println("Adatok a ki�rva a f�jlba!");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}