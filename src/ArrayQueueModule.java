public class ArrayQueueModule {
    public static void main(String[] args) {
//        проверка ArrayQueue
        ArrayQueue q = new ArrayQueue(6);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.printQueue();
        System.out.println("Size:" + q.size());
        System.out.println("First in Queue:" + q.element());
        System.out.println("Deleted: " + q.dequeue());
        q.clear();
        q.printQueue();
        System.out.println("Is empty:" + q.isEmpty());
    }
}