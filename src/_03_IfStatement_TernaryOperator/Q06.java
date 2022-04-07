package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Birincei bolgedesiniz");
        } else if (x > 0 && y < 0) {
            System.out.println("Ikinci bolgedesiniz");
        } else if (x < 0 && y < 0) {
            System.out.println("Ucuncu bolgedesiniz");
        } else if (x < 0 && y > 0) {
            System.out.println("Dorduncubolgedesiniz");
      /*  }else if () {
            System.out.println("X Ekseni bolgedesiniz");
        }else if () {
            System.out.println("Y Ekseni bolgedesiniz");
        }*/
        }
    }
}