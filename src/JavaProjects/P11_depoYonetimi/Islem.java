package JavaProjects.P11_depoYonetimi;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Islem implements toDo {
    Map<Integer, Urunler> urunMap = new HashMap<>();
    Urunler urun = new Urunler();
    Uretici uretici = new Uretici();
    static Scanner scan = new Scanner(System.in);

    public void menu() {
        urunTanimlama();
        urunListele();
        urunGirisi();
    }

    @Override
    public Urunler urunTanimlama() {
        System.out.println("Urun ismi giriniz : ");
        urun.setUrunIsmi(scan.nextLine());
        System.out.println("Uretici Firmanin ismini giriniz : ");
        uretici.setFirmaIsmi(scan.nextLine());
        System.out.println("Urun birimi giriniz : ");
        urun.setBirim(scan.nextLine());
        System.out.println("Urun miktari giriniz");
        urun.setMiktar(scan.nextInt());
        return urun;
    }

    @Override
    public void urun_ID_Tanimlama() {//urunun ismi, ureticisi ve birimi girilecek. id  alınacak.

        System.out.println("Urun ID'si giriniz : ");
        urun.setUrunID(scan.nextInt());
        urunMap.put(urun.getUrunID(), urun);

    }

    @Override
    public void urunListele() {// tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.
        System.out.println("Urun miktari :" + urun.getMiktar());
        System.out.println("Sectiginiz urun " + urun.getRaf() + ". raftadir");

    }

    @Override
    public void urunGirisi() {//giris yapmak istedigimiz urnunun id numarasi ile girecegiz.
        System.out.println("Degisiklik yapmak isteginiz urunun ID'sini giriniz :");
        if (urunMap.keySet().contains(scan.nextInt())) {
            System.out.println("Degitirmek istediginiz birim numarasini giriniz\n" +
                    "--------------------" +
                    "Urun Miktari : 1\n" +
                    "--------------------" +
                    "Urun Birimi : 2");
            switch (scan.next()) {
                case "1": {
                    try {
                        urun.setMiktar(+scan.nextInt());

                        if (scan.nextInt() < 0) {
                            ;
                            Exception ArithmeticException;
                        }
                    } catch (ArithmeticException e) {
                        scan.nextInt();
                    }
                    {

                    }
                    break;
                }

                case "2": {
                    try {
                        urun.setBirim(scan.nextLine());

                        if (scan.nextInt() < 0) {
                            ;
                            Exception ArithmeticException;
                        }
                    } catch (ArithmeticException e) {
                        scan.nextInt();

                        break;
                    }
                }
            }

        }




        }


    @Override
    public void urunuRafaKoy() {

    }

    @Override
    public void urunCikisi() {

    }
}