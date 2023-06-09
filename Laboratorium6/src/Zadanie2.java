import java.util.HashSet;
import java.util.Arrays;
public class Zadanie2 {
    public static void main(String[] args) {
        HashSet<String> kolor = new HashSet<String>();
        kolor.add("Red");
        kolor.add("Blue");
        kolor.add("Pink");
        kolor.add("Purple");
        kolor.add("Black");
        kolor.add("White");
        kolor.add("Aqua");
        kolor.add("Orange");
        kolor.add("Gray");
        kolor.add("Green");
        System.out.println(kolor);
        String arr[] = {"","","","","","","","","",""};
        int a=0;
        for (String i : kolor) {
            arr[a] = i;
           a++;
        }
        for (String z:arr
             ) {
            System.out.println(z);
        }}
}
