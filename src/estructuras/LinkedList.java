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
    
    public T topBack(){
        Nodo<T> temp = this.head;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        return temp.getKey();
    }
    
    public T popBack(){
        Nodo<T> temp = this.head;
        while(temp.getNext().getNext()!=null){
            temp = temp.getNext();
        }
        T aux = (T) temp.getNext().getKey();
        temp.setNext(null);
        return aux;
    }
    
    public void pushFront(T key){
        Nodo<T> nuevoNodo = new Nodo<>(key, this.head.getNext());
        this.head.setNext(nuevoNodo);
        this.size ++;
    }
    
    public T topFront(){ //Falta implementar si head == null
        return (T) this.head.getNext().getKey();
    }
    
    public T popFront(){ //Falta implementar si head == null
        Nodo<T> temp = this.head.getNext();
        this.head.setNext(temp.getNext());
        return temp.getKey();
    }
    
    public boolean find(T key){
        Nodo<T> temp = this.head.getNext();
        while(temp!=null){
            if(temp.getKey() == key){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
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
