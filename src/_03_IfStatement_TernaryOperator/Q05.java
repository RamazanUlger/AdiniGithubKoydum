package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihr Kilo ein.");
        int kilo = scan.nextInt();
        System.out.println("Geben Sie Ihr Alt ein. ");
        int alt = scan.nextInt();


        if (alt < 18) {
            System.out.println("Sie dürfen nicht Blut spenden");
        }
        if (alt >= 18) {
            if (kilo < 50) {
                System.out.println("Sie dürfen nicht Blut spenden");
            } else {
                System.out.println("Sie durfen Blut spenden");
            }
        }
    }
}


