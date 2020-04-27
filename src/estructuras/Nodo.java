package estructuras;

public class Nodo<T> {

    private T key;
    private Nodo next;
    private Nodo prev;
    
    public Nodo(){
        this.key = null;
        this.next = null;
        this.prev = null;
    }

    public Nodo(T key) {
        this.key = key;
        this.next = null;
        this.prev = null;
    }

    public Nodo(T key, Nodo next) {
        this.key = key;
        this.next = next;
        this.prev = null;
    }

    public Nodo(T key, Nodo next, Nodo prev) {
        this.key = key;
        this.next = next;
        this.prev = prev;
    }

    public T getKey() {
        return key;
    }

    public Nodo getNext() {
        return next;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

}
