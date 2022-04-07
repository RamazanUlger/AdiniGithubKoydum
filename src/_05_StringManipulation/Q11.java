package _05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

      /*  String a = str.substring(str.indexOf("A"),+1);

        String l=str.substring(str.indexOf("L"));
       l=l.substring(0,1);
        String i=str.substring(str.indexOf("I"));
        i=i.substring(0,1).toLowerCase();
        System.out.println(a+" "+l+" "+i);*/

        char a=str.charAt(str.indexOf('A'));
        char l=str.charAt(str.indexOf('L'));
        char i=str.charAt(str.indexOf('I'));


        System.out.println(""+a+l+i);
    }
}