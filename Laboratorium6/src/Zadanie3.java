import java.util.*;
import java.util.TreeSet;
public class Zadanie3 {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("Blue");
        tree.add("Green");
        tree.add("Yellow");
        tree.add("Purple");
        tree.add("Aqua");
        System.out.println("Drzewo zawierające pięć nazw kolorów: ");
        Iterator<String> itr = tree.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("White");
        tree2.add("Grey");
        tree2.add("Black");
        System.out.println("Drzewo zawierające trzy nazwy kolorów: ");
        Iterator<String> itr2 = tree2.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("Dodanie 2 drzewa do 1: ");
        tree.addAll(tree2);
        Iterator<String> itr3 = tree.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }
        System.out.println("Wypisanie elementów drzewa 1 w odwrotnej kolejności: ");
        LinkedList<String> lista = new LinkedList<>();
        LinkedList<String> odwlista = new LinkedList<>();
        Iterator<String> itr5 = tree.iterator();
        while (itr5.hasNext()){
            lista.add(itr5.next());
        }
        for (String a : lista) {
            odwlista.addFirst(a);
        }
        for (String b : odwlista) {
            System.out.println(b);
        }
        System.out.println("Pierwszy element tree1: " + tree.first());
        System.out.println("Ostatni element tree1: " + tree.last());
        TreeSet tree3 = new TreeSet();
        tree3 = (TreeSet)tree.clone();
        System.out.println("Liczba elementów przechowywanych w drzewie tree3: " + tree3.size());
        boolean d;
        for (String c: tree) {
            System.out.println("Czy element " + c + " w drzewie tree1 jest taki sam jak w tree2?");
            d = tree2.contains(c);
            System.out.println(d);
        }
    }
}
