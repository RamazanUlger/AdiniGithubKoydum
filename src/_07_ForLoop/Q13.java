package _07_ForLoop;

import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		
		/* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		String cumle="Java ogrenmek cok guzel";
		char harf='e';
		int count=0;
		for (int i = 0; i < cumle.length() ; i++) {
			if (cumle.charAt(i)==harf) {

				count++;

			}
		}
		System.out.println("Cumlede e harfi "+count+" kere gecmektedir");
		
		
	}

}
