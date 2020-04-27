
import estructuras.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio");
        LinkedList<Integer> list = new LinkedList<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.pushFront(6);
        list.pushFront(7);
        list.imprimir();
        System.out.println(list.popFront());
        System.out.println(list.popFront());
        System.out.println(list.popFront());
    }
}
