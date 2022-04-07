package _09_Arrays;

import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        String[] arrStr = str.split("");
        int toplam = 0;
        for (int i = 0; i < arrStr.length; i++) {
            if (Character.isDigit(arrStr[i].charAt(0))) {
                toplam += Integer.valueOf(arrStr[i]);
            }
        }

        System.out.println("Stringdeki rakamlarin toplami : " + toplam);
    }


}

