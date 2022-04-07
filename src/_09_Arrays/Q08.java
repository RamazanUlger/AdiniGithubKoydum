package _09_Arrays;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        str = str.replaceAll("\\D", "");
        System.out.println(str);
        String[] arrstr = str.split("");
        int[] arr1 = new int[arrstr.length];
        int toplam = 0;

        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = Integer.parseInt(arrstr[i]);
            toplam += arr1[i];

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(toplam);


    }

}



