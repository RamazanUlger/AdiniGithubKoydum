package _14_Encapsulation.Q02;

public class UserName  {
   /* public static void main(String[] args) {
      benutzerNamePrüfer(User.username);
    }*/

    protected static String benutzerNamePrüfer(String username) {
        String benutzerName="";
        if (!username.contains("benutzer1200")) {
            while (username.equalsIgnoreCase("BENUTZER1200")) {
                System.out.println("Ihren Benutzernamen passt nicht zusammen!\n Bitte geben Sie den nochmal ein!");
               // username = scan.next();
            }
            benutzerName=username;
        }
    return benutzerName;}
}
