package haluk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Isleminizi seciniz");

        boolean cikisMi = true;
        Kayit yeniKayit = new Kayit();
        int islem;
        List<Kullanici> kisi = new ArrayList<>();

        while (cikisMi) {
            System.out.println("Lutfen \n1: Kayit al\n2: Sansli kisi\n" +
                    "3: Kisiler listesi \n4: Cikis ");
            islem = scan.nextInt();
            switch (islem) {
                case 1:
                    kisi = yeniKayit.kayitAl();
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);

                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    System.out.println("cikis islemeniz gerceklesti");
                   cikisMi=false;
                    break;

            }
        }

    }
}