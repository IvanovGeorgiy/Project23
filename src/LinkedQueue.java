public class LinkedQueue {
    QueueNode front;
    QueueNode rear;

    public LinkedQueue(){
        front = null;
        rear = null;
    }

    public boolean isEmpty(){
        return front == null && rear == null;
    }

    public void enqueue(int newData){
        QueueNode current = new QueueNode(newData);
        if (rear == null){
            front = rear = current;
        }
        rear.next = current;
        rear = current;
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        QueueNode tmp = front;
        front = front.next;
        if (front == null){
            rear = null;
        }
        return tmp.getDate();
    }

    public int element(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        return front.getDate();
    }

    public int size(){
        QueueNode current;
        current = front;
        int size = 1;
        if (current == null){
            size = 0;
        }
        else {
            while (current.getNext() != null) {
                current = current.getNext();
                size += 1;
            }
        }
        return size;
    }

    public void clear(){
        while (front != null){
            System.out.println("Deleted: " + this.dequeue());
        }
    }
}
