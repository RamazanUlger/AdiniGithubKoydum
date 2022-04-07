package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        String str = "Veli";
        String str2 = "";
        kelimeyiTersineCevir(str);


    }

    public static void kelimeyiTersineCevir(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.substring(i, i + 1));

        }

    }
}
