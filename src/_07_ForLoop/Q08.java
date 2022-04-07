package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime yaz!");
        String kelime = scan.next();

        String kont = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            kont += kelime.charAt(i);
        }
        System.out.println("Tersten yazim : " + kont);
        if (kont.equalsIgnoreCase(kelime)) {
            System.out.println(kelime + " palindromdur");
        } else {
            System.out.println(kelime + " palindrom degildir");
        }
    }
}



