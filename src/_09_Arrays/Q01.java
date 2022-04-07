package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

    /* TASK :
     kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
     ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
     java code create ediniz.

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac adet sayi girmek istediginizi belirtiniz : ");
        int benutzer = scan.nextInt();
        int[] arr = new int[benutzer];
        System.out.println(Arrays.toString(arr));
        int s1 = Integer.MIN_VALUE;
        int s2 = Integer.MAX_VALUE;
        int sonuc = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Lutfen bir sayi giriniz : ");
            benutzer = scan.nextInt();
            arr[i] = benutzer;
            if (arr[i] < s2) {
                s2 = arr[i];
            }
            if (arr[i] > s1) {
                s1 = arr[i];
            }

        }
        System.out.println("En kucuk ve en buyuk arasindaki fark = "+(sonuc = (s1 - s2)));
    }
}


