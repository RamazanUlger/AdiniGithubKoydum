package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
      String email="johnbrown@hotmail.com";
      eMailÄnderung(email);
    }

    private static void eMailÄnderung(String email) {
        if (email.contains("hotmail")) {
           email= email.replace("hotmail","gmail");
            System.out.println(email);

        }else{
            System.out.println("E_mail basarili bir sekilde kayit edildi");
        }
    }
}
