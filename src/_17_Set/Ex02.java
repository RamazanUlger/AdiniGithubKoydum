package _17_Set;

import java.util.ArrayList;

public class Ex02 {

    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */


    public static void main(String[] args) {
        ArrayList<Integer> arrList1 = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();

        arrList1 = arrListHazirla(10, 0, 20);
        arrList2 = arrListHazirla(5, 0, 20);
        System.out.println(arrList1);
        System.out.println(arrList2);
        // arrList1.retainAll(arrList2);
        //System.out.println(arrList1);
        //arrList2.removeAll(arrList1);
        //System.out.println(arrList2);
        ArrayList<Integer> arrListFark1=new ArrayList<>();
        ArrayList<Integer> arrListFark2=new ArrayList<>();
        arrListFark1=arrList1;
        arrListFark1.removeAll(arrList2);
        System.out.println(arrListFark1);
        arrListFark2=arrList2;
        arrListFark2.removeAll(arrList1);
        System.out.println(arrListFark2);

    }

    public static int getRandom(int max, int min) {
        return (int) (Math.random() * (min - max + 1));
    }

    private static ArrayList<Integer> arrListHazirla(int size, int min, int max) {
        ArrayList arrList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrList.add(getRandom(min, max));
        }
        return arrList;
    }


}
