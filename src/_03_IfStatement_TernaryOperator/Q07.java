package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		   hatali giris seklinde code create ediniz
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte ein Karakter ein.");
        char karakter = scan.next().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println("Grossen Buchstaben");
        } else if (karakter > 'a' && karakter <= 'z') {
            System.out.println("Kleinen Buchstaben");
        }else{
            System.out.println("Fehlende Eingabe");
        }


    }

}
