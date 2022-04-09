package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    int minute=60;
    int sekunde=60;
    double mile=1.609344;
    int gram=1000;
    static int input;
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */    Scanner scan=new Scanner(System.in);
        input = scan.nextInt();
        auswahl(input);

        }

    private static void auswahl(int input) {
        System.out.println("Wählen sie bitte eine unten angegebene Nummer! \n" +
                "" +
                "Wählen Sie bitte 1, damit es Sekunden umwandelt. \n " +
                "Wählen Sie bitte  2, damit Mile zu Km  umwandelt. \\n \"");
        input = scan.nextInt();
        switch (input){
            case 1:stundenUmwandlung();
            break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    public static void stundenUmwandlung() {
        Q03 obj1= new Q03();
        System.out.println( input+" Stunde ist ="+(input*obj1.minute* obj1.sekunde)+ " Sekunden.");
    }
    public static  void mileUmwandlung(){

    }
    public static  void gramUmwandlug(){

    }


}


