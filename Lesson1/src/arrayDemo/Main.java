package arrayDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Ali";
		String ogrenci2 = "Huseyn";
		String ogrenci3 = "Javid";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("---------------------------------");

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Ali";
		ogrenciler[1] = "Javid";
		ogrenciler[2] = "Huseyn";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("---------------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
