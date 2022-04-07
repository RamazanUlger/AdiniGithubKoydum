package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi ve Soyadinizi yaziniz : ");
        String adSoyad = scan.nextLine();
        if (adSoyad.contains(" ")) {
            String ad = adSoyad.substring(adSoyad.indexOf(""), adSoyad.indexOf(" "));
            System.out.println("Adiniz: " + ad);
            String soyad = adSoyad.substring(adSoyad.indexOf(" ", adSoyad.indexOf("")));
            System.out.println("Soyadiniz: " + soyad);
        }else {
            System.out.println("Adiniz ve Soyadiniz arasinda bir bosluk birakiniz!");
        }

    }
}
