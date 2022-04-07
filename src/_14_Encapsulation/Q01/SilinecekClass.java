package _14_Encapsulation.Q01;

import java.util.ArrayList;
import java.util.Scanner;

public class SilinecekClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> listSayilar = new ArrayList<>();
        System.out.println("List ekle : ");
        listSayilar.add(scan.nextLine());
        System.out.println(listSayilar);
        System.out.println(listSayilar.size());

    }
}
