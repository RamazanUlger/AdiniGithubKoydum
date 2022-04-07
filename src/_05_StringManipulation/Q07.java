package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim
         * sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli)
         * olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
 Scanner scan=new Scanner(System.in);
        System.out.println("LUtfen bir kelime giriniz");
String kelime= scan.next();
       char c1=kelime.charAt(0);
       char c2=kelime.charAt(1);
       char c3=kelime.charAt(2);
     //  String sonuc=kelime.length()==3 ?((c1==c3 && c2==c2 )? "girdiginiz keleme unique": "girdiginiz kelme uniqua degil");

    }
}