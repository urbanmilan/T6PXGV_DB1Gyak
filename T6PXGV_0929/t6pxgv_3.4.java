package asd;

import java.io.*;

public class Negyedik {
	public void hf2 (String fnev) {
		String sor;
		String[] szavak;
		int sorid = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fnev));
			while ((sor = br.readLine()) != null) {
				System.out.println(sor.toUpperCase());
			}
		} catch (Exception ee ) {
			ee.printStackTrace();
		}
	}
}
