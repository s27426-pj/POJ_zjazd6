import java.util.LinkedList;
public class Zadanie1 {
    public static void main(String[] args) {
        LinkedList<String> zwierz = new LinkedList<String>();
        zwierz.add("Koń");
        zwierz.add("Krowa");
        zwierz.add("Kura");
        zwierz.add("Kaczka");
        zwierz.add("Kura");
        zwierz.add("Śledz");
        System.out.println("Orginalna lista: " + zwierz);
        System.out.println("Usunięto: " + zwierz.getFirst());
        zwierz.removeFirst();
        System.out.println("Usunięto: " + zwierz.getLast());
        zwierz.removeLast();
        System.out.println("Lista po usunięciu: " + zwierz);
    }
}
