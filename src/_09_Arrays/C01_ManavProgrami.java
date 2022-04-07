package _09_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ManavProgrami {
    static List<String> urunListesi = new ArrayList<>();
    static List<Double> fiyatListesi = new ArrayList<>();
    static double toplamTutar;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir
         * ve kac kilo oldugunu sor.

         * * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * istemiyorsa toplam miktari goster,
         *  istiyorsa tekrar urun sectir.
         * Bu islemi alisverisi bitirmek isteyene kadar tekrarla.

         * * 3. Adim : Musteri her urun sectiginde, aldigi
         *  urunun fiyatini toplam fiyata ekle.

         * * 4. Adim : Alisveris bitince toplam odemesi gereken
         *  tutari goster.
         *
         * */

        urunListesi.add("Elma icin 1");
        urunListesi.add("Muz icin 2");
        urunListesi.add("Armut icin 3");
        urunListesi.add("Elma icin 4");
        urunListesi.add("Elma icin 5");

        fiyatListesi.add(1.99);
        fiyatListesi.add(0.99);
        fiyatListesi.add(2.99);
        fiyatListesi.add(5.99);
        fiyatListesi.add(1.99);
        System.out.println(urunListesi);
        musteriSecim();
    }

    private static void musteriSecim() {
        System.out.println("Sectiginiz urun kodunu girin : ");
        int secim = scan.nextInt();
        System.out.println("Urunun kilosunu giriniz :");
        double kilo = scan.nextDouble();
        double urunTutari = kilo * fiyatListesi.get(0);
        toplamTutar = urunTutari;
        int devam = scan.nextInt();
        if (devam == 1) {
            musteriSecim();//recursive method
        }else
         kasa(toplamTutar);
        System.out.println("Devam etmek istiyorsaniz 1'e kasaya gitmek icin 2'e basiniz");

    }

    private static void kasa(double toplamTutar) {
        System.out.println(toplamTutar+" $"+" Odemeniz gerekmektedir");
    }


}
