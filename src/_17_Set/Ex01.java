package _17_Set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

    /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan bir array elemanlari set'e convert eden bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print
     ediniz.
     */

    public static void main(String[] args) {

        Set<Integer> set1=new HashSet<>();
        Integer arr[]={1,2,5,3,4,5,2,3,6,5,21,7,52,25};
        HashSet<Integer> hset=new HashSet<>();
        yazdir(elementEkle(set1,arr));


    }

    private static void yazdir(Set set) {
        System.out.println(set);
    }

    private static Set elementEkle(Set<Integer> set1, Integer[] arr) {
        for (Integer each:arr
             ) {
            set1.add(each);
        }
        return set1;
    }
}
