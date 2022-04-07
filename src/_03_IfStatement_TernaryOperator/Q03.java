package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<=BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
        Scanner scan =new Scanner(System.in);
        System.out.println("***** BMI Hesaplama*****");
        System.out.println("Boyunuzu(M) ve Kilonuzu(kg) giriniz : ");
        double boy= scan.nextDouble();
        double kilo= scan.nextDouble();
        double deger=kilo/((boy/100)*(boy/100));
        if (deger < 20 ) {
            System.out.println("Oldukca zayifsiniz");
        }else if (deger >=20 && deger<=25 ) {
            System.out.println("Normal sinirlardasiniz");
        }else if (deger >= 25 && deger <=30) {
            System.out.println("Sisman kategorisindesiniz");
        }else if (deger > 30) {
            System.out.println("Obez grubundasiniz.");
        }else {
            System.out.println("Islem gerceklestiremiyor");
        }
        System.out.println(deger);



    }

}
