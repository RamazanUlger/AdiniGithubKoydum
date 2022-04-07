package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner scan=new Scanner(System.in);
        int input;
        int count=0;
        int toplam=0;
        do {
            System.out.println("lutfen bir sayi giriniz");
            input= scan.nextInt();
            if ((input<5) || (input>10)) {
                toplam += input;
            }
            count++;
        }while (count<5);{

        }
        System.out.println("Sayac artisi "+count+"'defadir");
        System.out.println("5 ile 10 arasinda olamayan sayilarin toplami = "+toplam);
    }

}
