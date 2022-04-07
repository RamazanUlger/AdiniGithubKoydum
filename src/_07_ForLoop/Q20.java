package _07_ForLoop;

import java.util.Scanner;

public class Q20 {
    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {
        int sayi=18;
        int sayi2=24;
        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <sayi2 ; j++) {
                if (sayi%i==0 && sayi2%j==0) {
                    if (i == j) {

                            System.out.println(i);

                    }


                }

            }
        }


    }
}
