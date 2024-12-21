public interface Queue {
    void enqueue(int item);
    int dequeue();
    int size();
    void clear();
    int element();
    boolean isEmpty();
}