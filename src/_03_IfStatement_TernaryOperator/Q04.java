package _03_IfStatement_TernaryOperator;

import java.util.Locale;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */

  Scanner scan=new Scanner(System.in);
		System.out.println("lutfen meslegini numeretik olarak kodlayini : \n" +
				" qa icin 1'i\n" +
				"dev icin 2'i\n" +
				"ba icin 3'u\n" +
				"pm icin 4'u seciniz...  ");
	int meslekKisaltma= scan.nextInt();
		if (meslekKisaltma!=1 && meslekKisaltma!= 2 && meslekKisaltma!= 3 && meslekKisaltma!= 4) {
			System.out.println("Lutfen 1 ile 4 arasinda bir secim yapiniz! ");
		}
		if (meslekKisaltma ==1 ) {
			System.out.println("Mesleginiz Quality Analyst'dir");
		}else if (meslekKisaltma==2) {
			System.out.println("Mesleginiz Developer'dir");
		}else if (meslekKisaltma==3) {
			System.out.println("Mesleginiz Busines Analyst'dir");
		}else if (meslekKisaltma==4) {
			System.out.println("Mesleginiz Projekt Manager'dir  ");
		}else {
			System.out.println("Hatali bir secim yaptiniz");
		}


	}

}
