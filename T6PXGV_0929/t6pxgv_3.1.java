package talibe;

import java.io.*;
import java.util.*;

public class Asd {

	public static void main(String[] args) {
		int db = 0;
		int ossze = 0;
		
		try(Scanner sc = new Scanner(new File("Urban.txt")))
		{
			while(sc.hasNextInt())
			{
				db++;
				ossze += sc.nextInt();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}

		System.out.println(db + "db sz�m van a f�jl-ba");
		System.out.println("a f�jl-ban l�v� sz�mok �sszge: " + ossze);
	}

}