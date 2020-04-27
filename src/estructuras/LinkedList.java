package estructuras;

public class LinkedList<T> {
    private Nodo<T> head;
    private int size;
    
    public LinkedList(){
        this.head = new Nodo();
        this.size = 0;
    }
    
    public void pushBack(T key){
        Nodo<T> nuevoNodo = new Nodo(key);
        if(isEmpty()){
            head.setNext(nuevoNodo);
        }else{
        Nodo<T> temp = this.head;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(nuevoNodo);
        }
        this.size +=1;
    }
    
    public void pushFront(T key){
        Nodo<T> nuevoNodo = new Nodo<>(key, this.head.getNext());
        this.head.setNext(nuevoNodo);
        this.size ++;
    }
    
    public T popFront(){
        Nodo<T> temp = this.head.getNext();
        this.head.setNext(temp.getNext());
        return temp.getKey();
    }
    
    public boolean isEmpty(){
        return this.size <= 0;
    }
    
    public int size(){
        return this.size;
    }
    
    public void imprimir(){
        if(!isEmpty()){
            Nodo temp = this.head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
                System.out.print(temp.getKey() + " ");
            }
            System.out.println("");
        }
    }
    
}
