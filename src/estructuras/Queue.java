
package estructuras;

public interface Queue<T> {
    public int size();
    public boolean isEmpty();
    public void enqueue(T key);
    public T dequeue();
    public T peek();
}
