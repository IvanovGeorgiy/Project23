public class RealizationArrayQueueADT extends ArrayQueueADT{
    private final int maxSize;
    private final int[] queueArray;
    private int front;
    private int rear;
    private int count;
    public RealizationArrayQueueADT(int size)  {
        super(size);
        this.maxSize = super.maxSize;
        System.out.println(maxSize);
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
        count = 0;
    }
    public void enqueue(int item){
        if (isEmpty()){
            front = 0;
            rear = 0;
            queueArray[rear] = item;
            count += 1;
        }
        else {
            rear = (rear + 1) % maxSize;
            if (rear == front) {
                System.out.println("Queue is full. Can't enqueue.");
                count = rear + 1;
                rear = (rear - 1 + maxSize) % maxSize;
            }
            else {
                queueArray[rear] = item;
                count += 1;
            }
        }
    }
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public int size(){
        return count;
    }

    public int element(){
        return queueArray[front];
    }

    public void clear(){
        while (count != 0){
            System.out.println(this.dequeue());
        }
        System.out.println("Queue has been cleared");
        rear = -1;
        front = -1;
    }
    public int dequeue(){
        int item = -1;
        if (!isEmpty()){
            item = queueArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
                count = 0;
            }
            else {
                front = (front + 1) % maxSize;
                count -= 1;
            }
        }
        else {
            System.out.println("Queue is empty. Can't dequeue.");
        }
        return item;
    }
    public void printQueue(){
        for (int i = 0; i < count; i++){
            System.out.println(queueArray[i]);
        }
    }
}