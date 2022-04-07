package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Aldiginiz urun adedini giriniz");
        int urunAdet = scan.nextInt();
        System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");
        int listFiyat = scan.nextInt();
        double toplamTutar=urunAdet*listFiyat;
        System.out.println("Indirimsiz toplam tutariniz = "+toplamTutar);
        System.out.println("Musteri kartinizi onaylayin\n" +
                "Evet icin E\n" +
                "Hayir icin H");
        char musteriKart = scan.next().toUpperCase().charAt(0);

        double indirim = 0;
        if (musteriKart == 'E') {
            if (urunAdet >= 10) {
                indirim = toplamTutar * 20 / 100;
                System.out.println("Indiriminiz" + " " + indirim);
            } else {
                indirim = toplamTutar* 15 / 100;
            }
        } else {
            if (musteriKart == 'H') {
                if (urunAdet >= 10) {
                    indirim = toplamTutar * 15 / 100;
                    System.out.println("Indiriminiz" + " " + indirim);
                } else {
                    indirim = toplamTutar * 10 / 100;
                    System.out.println("Indiriminiz" + " " + indirim);
                }

            }
        }
        System.out.println("Toplam tutar = " + (toplamTutar - indirim));
    }

}
