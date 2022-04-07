package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */


        String isimSoyisim= "Ahmet Emin Yılmaz";
        String isim=isimSoyisim.substring(isimSoyisim.indexOf(""),isimSoyisim.indexOf(" "));
       // System.out.println(isimSoyisim);
      String isim2=isimSoyisim.substring(isimSoyisim.indexOf(" "),isimSoyisim.indexOf(" ")+1);
       // String soyismin=isimSoyisim.substring(isimSoyisim.indexOf(" "+2,isimSoyisim.indexOf("")));
        System.out.println(isim);
    System.out.println(isim2);
       // System.out.println(soyismin);
    }
}
//String isim2=isimSoyisim.substring(isimSoyisim.indexOf("")+1+isim.indexOf("",isimSoyisim.indexOf(" ")));