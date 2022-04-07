package _05_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Isim ve Soyisim giriniz");
        String isimSoyisim = "ramazan yilmaz";
        System.out.println("Lutfen 16 haneli kart numaranizi giriniz : ");
        String kKNo = "1234567891234567";
        String isim = "";
        String soyIsim = "";


        if (kKNo.length() < 16 || kKNo.length() > 16) {
            System.out.println("Gecersiz Kredikarti!");

        } else if (kKNo.length() == 16) {
            isim = isimSoyisim.substring(0, isimSoyisim.indexOf(" ") - 1);
            isim = isim.substring(0,1).toUpperCase() + isim.replaceAll("\\w", "*");
            soyIsim = isimSoyisim.substring(isimSoyisim.indexOf(" ")+1, isimSoyisim.length()).toUpperCase();
            soyIsim=soyIsim.substring(0,1)+soyIsim.replaceAll("\\w","*");
            kKNo = kKNo.substring(0, 12).replaceAll("\\d", "*") + kKNo.substring(12, kKNo.length());



            System.out.println(kKNo);
            System.out.println(isim);
            System.out.println(soyIsim);
        }
    }
}
