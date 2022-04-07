package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen hiziniz giriniz : ");
        int hiziniz = scan.nextInt();
        boolean bl = hiziniz < 0 || hiziniz > 250;
        System.out.println("Lutfen Ehliyetinizi olup olmadiginizi onaylayin\n" +
                "Evet ehliyetim var\n" +
                "Hayir ehliyetim yok");
        String ehliyet=scan.next().toUpperCase();
        int extraCeza=200;
        if (bl) {
            System.out.println("Lutfen 0'dan buyuk 250'den kucuk bir sayi giriniz!");
            if (ehliyet.equals("EVET")) {
                if (hiziniz <= 45) {
                    System.out.println("Cezaniz bulunmamaktadir");
                } else if (hiziniz>=55 && hiziniz <75) {
                    System.out.println("Ceza 100$");
                }else if (hiziniz>=75 && hiziniz < 85) {
                    System.out.println("Ceza 150$");
                }else if (hiziniz>=85 && hiziniz < 94) {
                    System.out.println("Ceza 320$");
                }else if (hiziniz >= 95 && hiziniz <250 ) {
                    System.out.println("Ceza 500$");
                }
            }else if (ehliyet.equals("HAYIR")) {

            }
        }
    }
}
