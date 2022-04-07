package _05_StringManipulation;

public class Q05 {
    public static void main(String[] args) {
    /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
        String  str1= "$13.99";
        String str2= "$10.55";
       toplamFiyat(str1,str2);

    }

    private static void toplamFiyat(String str1, String str2) {
        str1=str1.replaceAll("\\W","");
        str2=str2.replaceAll("\\W","");
        System.out.println(str1);
        double sayi1=Double.parseDouble(str1);
        double sayi2=Double.parseDouble(str2);
        System.out.println((sayi1+sayi2)/100);
    }
}
