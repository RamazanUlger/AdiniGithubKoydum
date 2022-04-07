package _09_Arrays;

import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */
        String [] arrStr={"GayetBasarılı"};
        String str="";
        for (int i = 0; i <arrStr.length ; i++) {
            str+=arrStr[i];
        }
        System.out.println(str);
        str=str.replaceAll("Gayet","Coook");
        System.out.println(str);

        arrStr[0]=str;
        System.out.println(Arrays.toString(arrStr));




    }

}
