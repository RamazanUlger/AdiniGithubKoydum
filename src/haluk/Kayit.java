package haluk;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
    List<Kullanici> kisiler = new ArrayList<>();//bos list creat edildi

    public List<Kullanici> kayitAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanici Ismi giriniz : ");
        String isim = scan.nextLine();
        Kullanici k1 = new Kullanici(isim, LocalDateTime.now());
        kisiler.add(k1);
        return kisiler;
    }

    public void sansliKullanici(List<Kullanici> kll) {
        for (Kullanici k : kll
        ) {
            if (k.kayitZamani.getSecond() < 10) {
                System.out.println("Sansli kisiniz " + k.name);
            } else System.out.println("Malesef sanlisli kisi degilsiniz " + k.name);
        }

    }
    public void  listele(List<Kullanici> kullanicilar){
        for (Kullanici k:kullanicilar
             ) {
            System.out.println("Adi : "+k.name+ "Kayit zamani : "+k.kayitZamani);
        }
    }

}
