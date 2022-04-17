package _10_List.projects.P01_FilmTahmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin2 {
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */
        System.out.println("Lutfen 1 ile 8 arasinda bir sayi seciniz");
        int secim = scan.nextInt();
        System.out.println("Sectiginiz film : " + film.get(secim - 1).length() + " harflidir.");
        int uzunluk = film.get(secim - 1).length() * 2;
        System.out.println(uzunluk + " tahmin hakkiniz vardir.");
        String gizliIsim;
        gizliIsim=film.get(secim - 1).replaceAll("\\w", "_");

        int counter = uzunluk;
        int tahminsayisi = 0;
        String tahmin;

        while (counter > 0) {
            System.out.println("lutfen tahmininizi giriniz." + "\n Kalan tahmin" + counter);
            counter--;
            tahmin = scan.next().toUpperCase();
            if (film.get(secim - 1).equals(tahmin)) {
                counter = 0;
                System.out.println("Tebrikler tahmin ettiginiz film dogrudur. : " + film.get(secim - 1));

            } else {
                for (int i = 0; i < film.get(secim - 1).length(); i++) {
                    for (int j = 0; j < tahmin.length(); j++) {

                        if (film.get(secim-1).charAt(i)==tahmin.charAt(j)) {
                            // gizliIsim=gizliIsim.replace(i,tahmin.charAt(j));

                        }
                    }
                }
            }
        }
    }
}
