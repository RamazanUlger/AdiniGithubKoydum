package haluk;

import java.time.LocalDateTime;


public class Kullanici {
    String name ;
    LocalDateTime kayitZamani;

    Kullanici(){

    }

    Kullanici(String name, LocalDateTime kayitZamani){
        this.name=name;
        this.kayitZamani=kayitZamani;
    }
}

