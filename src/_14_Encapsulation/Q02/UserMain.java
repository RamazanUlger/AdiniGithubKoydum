package _14_Encapsulation.Q02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain extends User{

    public static void main(String[] args) {

        User benutzer =new User("ramazan","",1000,false,false);

        User benutzer2=new User("benutzer1200","benutzer123",1001,false,false);
        System.out.print(benutzer2);
        System.out.print(benutzer);
    }
}
