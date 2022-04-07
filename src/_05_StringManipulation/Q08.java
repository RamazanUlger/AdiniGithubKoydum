package _05_StringManipulation;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        String str = "Ali";
        isimOlcum(str);
    }

    private static void isimOlcum(String str) {
        if (str.length() >= 3) {

                str = str.substring(1,3);
                System.out.println(str+" "+ str+" "+str);


        } else {
            System.out.println("isim 3 harften kisadir");
        }
    }
}
