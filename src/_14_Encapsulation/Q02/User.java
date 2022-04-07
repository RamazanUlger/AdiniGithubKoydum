package _14_Encapsulation.Q02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class User {

    protected  String username = "nicht eingegeben";
    protected  String password = "nicht eingegeben";
    protected  boolean active = false;
    protected  boolean signIn = false;
    protected  Scanner scan = new Scanner(System.in);
    protected  int id = 1000;

    public User() {
        System.out.println("User Const ist gearbeitet! ");
    }

    public User(String username, String password, int id, boolean active, boolean signIn) {

        System.out.println("Geben Sie bitte Ihren Benutzernamen ein.");
        username = scan.next();
        setUsername(username);
        System.out.println("Geben Sie bitte Ihr Kennwort ein");
        password = scan.next();
        setPassword(password);
        setActive(active);
        setSignIn(signIn);
        setId(id);
    }


    public String passwordKontrolle(String password) {
        if (password.length() < 6) {
            while (password.length() < 6) {
                System.out.println("Geben Sie das Kennwort noch mal ein! ");
                password = scan.next();
            }
        } else return password;
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        // username=UserName.benutzerNamePrüfer(username);
        this.username =username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = passwordKontrolle(password);
    }

    public boolean isActive() {

        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignIn() {
        return signIn;
    }

    public void setSignIn(boolean signIn) {
        if (password.length() >= 6 && username.equalsIgnoreCase("benutzer1200")) {
            this.signIn = true;
        } else this.signIn = signIn;

    }



    public  int getId() {
         id++;
        return id;  }

    public  void setId(int id) {
        id++;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "Benutzername= " + username + '\'' +"\n"+
                        "Kennwort= " + password + '\'' + "\n" +
                        "Login= " + signIn + '\'' + "\n" +
                        "Active= " + active + '\'' + "\n" +
                        "Benuzter ID= " + id +
                        '}';
    }
}
