package projects.P01_FilmTahmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin3 {
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    static Scanner scan = new Scanner(System.in);
    static char tahminEdilenHarf;
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
        System.out.println("Lutfen secim yapmak icin 1 ile 8 arasinda bir sayi giriniz...");
        int secim = scan.nextInt();
        String secilenFilm = film.get(secim - 1);
        System.out.println("Sectiginiz film : " + secilenFilm.toUpperCase().replaceAll("\\w", "-")
                .replaceAll("", " "));
        int tahminHakki = secilenFilm.length() * 2;
        System.out.println("Tahmin hakkiniz, secim yaptiginiz filmin harfsayisinin 2 katidir : " + tahminHakki);


        tahminMethodu(secilenFilm, tahminHakki);


    }



    private static void tahminMethodu(String secilenFilm, int tahminHakki) {

        String str = secilenFilm;
        System.out.println(secilenFilm);
        System.out.println("Sectiginiz film : " + secilenFilm.replaceAll("\\w", "-")
                .replaceAll("", " "));
        str = secilenFilm.replaceAll(" ", "").replaceAll("\\w", "-");
        System.out.println(secilenFilm);
        System.out.println(str);

        char geciciharfDeposu;
        String harfDeposu;


      do {
          tahminEdilenHarf=scan.next().charAt(0);
          System.out.println("tahmin hakki : "+tahminHakki);
          for (int i = 0; i <secilenFilm.length() ; i++) {
              if (secilenFilm.charAt(i)== tahminEdilenHarf) {
                  for (int j = 0; j < str.length(); j++) {

                      str=str.replace(str.substring(j),secilenFilm.substring(i));
                  }
               //   str=str.replace(str.charAt(),secilenFilm.charAt(i));

                  System.out.println(str);
              }

          }
          tahminHakki--;
        }while (tahminHakki>0);

        }
    }
