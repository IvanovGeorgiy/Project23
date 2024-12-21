public class ArrayQueue {
    private final int maxSize;
    private final int[] queueArray;
    private int front;
    private int rear;
    private int count;
    public ArrayQueue(int size)    {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
        count = 0;
    }
    public void enqueue(int item)    {
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
    public int dequeue()
    {
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

    public int peek()
    {
        if (!isEmpty())
        {
            return queueArray[front];
        }
        else
        {
            System.out.println("Queue is empty. Can't peek value.");
            return -1;
        }
    }

    public boolean isEmpty() {
        //System.out.print("Пустой: ");
        return front == -1 && rear == -1;
    }

    public int size(){
        return count;
    }

    public int element(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            return queueArray[front];
        }
    }
    public void printQueue(){
        for (int i = 0; i < count; i++){
            System.out.println(queueArray[i]);
        }
    }
    public void clear(){
        while (count != 0){
            System.out.println(this.dequeue());
        }
        System.out.println("Queue has been cleared");
        front = -1;
        rear = -1;
    }
}