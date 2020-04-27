
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
        System.out.println(list.topFront());
        System.out.println(list.topBack());
        System.out.println(list.popBack());
        list.pushFront(10);
        list.pushBack(9);
        list.pushFront(8);
        list.imprimir();
        System.out.println(list.find(9));
        System.out.println(list.find(11));
    }
}
