public class TestAbstractAndLinkedQueue {
    public static void main(String[] args) {
        RealizationArrayQueueADT taq = new RealizationArrayQueueADT(5);
        taq.enqueue(1);
        taq.enqueue(2);
        taq.enqueue(3);
        System.out.println("Deleted: " + taq.dequeue());
        System.out.println("Deleted: " + taq.dequeue());
        System.out.println("Empty: " + taq.isEmpty());
        System.out.println("Deleted: " + taq.dequeue());
        System.out.println("Size: " + taq.size());
        taq.enqueue(52);
        taq.printQueue();

        LinkedQueue lq = new LinkedQueue();
        lq.enqueue(1);
        lq.enqueue(2);
        System.out.println("First in Queue:" + lq.element());
        System.out.println("Empty: " + lq.isEmpty());
        System.out.println("Size: " + lq.size());
        System.out.println("Deleted: " + lq.dequeue());
        System.out.println("Deleted: " + lq.dequeue());
        System.out.println("Size: " + lq.size());
        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        System.out.println("Size: " + lq.size());
        lq.clear();
        System.out.println("Empty: " + lq.isEmpty());
    }
}