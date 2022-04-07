package _07_ForLoop;

public class Q09 {

    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.
        int sayi1=1;
        int sayi2=1;
        int toplam=0;
        for (int i = 1; i <=10 ; i++) {

            toplam=sayi1*sayi2;

            System.out.println(sayi1+" "+"x"+" "+sayi2+" "+"="+" "+toplam);
          sayi2++;
        }


    }
}
