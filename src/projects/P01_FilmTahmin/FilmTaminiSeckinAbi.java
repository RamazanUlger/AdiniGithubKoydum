package projects.P01_FilmTahmin;

import java.util.*;

public class FilmTaminiSeckinAbi {


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
            int tahminHakki = film.get(secim - 1).length() * 2;
            System.out.println(tahminHakki + " tahmin hakkiniz vardir.");

            List<String> filmAdi = new ArrayList<>();
            filmAdi.add(film.get(secim - 1));
            String filmIsmi=film.get(secim - 1);

            List<Character> gizliFilmAdi = new ArrayList<>();
            for (int i = 0; i < filmAdi.get(0).length(); i++) {
                gizliFilmAdi.add('_');
            }
            System.out.println(gizliFilmAdi);

            int counter = tahminHakki;
            int tahminsayisi = 0;
            String tahmin;
            int yanlisTahminSayisi = 0;

            while (counter > 0) {
                System.out.println("lutfen tahmininizi giriniz." + "\n --------------------------------------------");
                System.out.println("Kalan tahmin sayisi : " + counter);

                System.out.println("Yanlis tamin sayisi : "+yanlisTahminSayisi);
                yanlisTahminSayisi++;
                counter--;
                tahmin = scan.next().toUpperCase(Locale.ROOT);
                List<String> kullaniciGirisi = new ArrayList<>();
                kullaniciGirisi.add(tahmin);
                if (kullaniciGirisi.equals(filmAdi)) {
                    counter = 0;
                    System.out.println("Tebrikler dogru tahmin : " + filmAdi);
                    System.out.println(yanlisTahminSayisi+". tahmininizde bildiniz");

                } else if (tahmin.length() > filmAdi.get(0).length() || tahmin.length() < filmAdi.get(0).length()) {
                    System.out.println("Lutfen " + filmAdi.get(0).length() + " uzunlugunda bir tahmin giriniz");

                } else {
                    for (int i = 0; i <tahmin.length(); i++) {
                        int sub=i+1;
                        if (filmIsmi.substring(i, sub).equals(tahmin.substring(i, sub))) {
                            char bulunan = filmAdi.get(0).charAt(i);
                            gizliFilmAdi.set(i,bulunan);

                        }
                    }
                    System.out.println(gizliFilmAdi);


                }

            }
        }
    }

