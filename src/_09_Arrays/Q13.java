package _09_Arrays;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */

        Scanner scan=new Scanner(System.in);
        int arr[]=new int[3];
        int count=0;
        for (int i =0; i <=arr.length-1; i++) {
            System.out.println("Eleman "+i+ " giriniz : ");
            arr[i]=scan.nextInt();
            if (arr[i]%3==0) {
                count++;
            }
        }
        System.out.println(count+ " kadar bolunenbilen elaman vardir");


    }

}
