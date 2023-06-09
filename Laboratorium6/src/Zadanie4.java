import java.util.HashMap;
import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        int a;
        HashMap<Integer,String> miesiac = new HashMap<>();
        miesiac.put(0,"Styczeń");
        miesiac.put(1,"Luty");
        miesiac.put(2,"Marzec");
        miesiac.put(3,"Kwieceń");
        miesiac.put(4,"Maj");
        miesiac.put(5,"Czerwiec");
        miesiac.put(6,"Lipiec");
        miesiac.put(7,"Sierpień");
        miesiac.put(8,"Wrzesień");
        miesiac.put(9,"Październik");
        miesiac.put(10,"Listopad");
        miesiac.put(11,"Grudzień");
        System.out.println("Podaj numer miesiąca: ");
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();
        if (a<0){
            System.out.println("Nieprawidłowa cyfra!");
        } else if (a>11) {
            System.out.println("Nieprawidłowa cyfra!");
        }
        else {
            System.out.println("Ten miesiąc to: " + miesiac.get(a-1));
        }
    }
}
