package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    Sesli harfler: a,e,i,o,u
    Test Data:
    a
    Beklenen Çıktı:
    a harfi sesli harfdir.
    Test Data:
    d
    Beklenen Çıktı:
    d harfi sesiz harftir.
    Test Data:
    we  yada %
    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf giriniz : ");
        char harf = scan.next().charAt(0);
        String harfler1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜß";
        String harfler2 = "abcdefghijklmnopqrstuvwxyzäöüß";

       boolean bl1= buyukSesliHarfKontrol(harfler1, harf);
       boolean bl=  kucukSesliHarfkontrol(harfler2, harf);
        if (bl == true || bl1 == true) {
            System.out.println(harf + " sesli harf");
        } else if (bl == false || bl1 == false) {
            System.out.println(harf + " sessiz harf");
        }
    }

    private static boolean kucukSesliHarfkontrol(String harfler2, char harf) {
        boolean bl = false;
        if (harf >= 'a' && harf <= 'z') {

            char geciciharfDeposu2;
            for (int i = 0; i < harfler2.length() - 1; i++) {
                geciciharfDeposu2 = harfler2.charAt(i);
                if (geciciharfDeposu2 == 'a' || geciciharfDeposu2 == 'e' || geciciharfDeposu2 == 'i' || geciciharfDeposu2 == 'o'
                        || geciciharfDeposu2 == 'u' || geciciharfDeposu2 == 'ü' || geciciharfDeposu2 == 'ö' || geciciharfDeposu2 == 'ä') {
                    bl = true;
                } else   {
                    bl = false;
                }
            }
        }
       return bl;
    }



    private static boolean buyukSesliHarfKontrol(String harfler1, char harf) {
        boolean bl = false;
        if (harf >= 'A' && harf <= 'Z') {
            char geciciharfDeposu;
            for (int i = 0; i <= harfler1.length() - 1; i++) {
                geciciharfDeposu = harfler1.charAt(i);
                if (geciciharfDeposu == 'A' || geciciharfDeposu == 'E' || geciciharfDeposu == 'I' || geciciharfDeposu == 'O'
                        || geciciharfDeposu == 'U' || geciciharfDeposu == 'Ü' || geciciharfDeposu == 'Ö' || geciciharfDeposu == 'Ä') {
                    bl = true;
                } else {
                    bl = false;
                }
            }
        }

        return bl;
    }
}







