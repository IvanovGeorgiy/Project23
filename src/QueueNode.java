public class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int newData){
        this.data = newData;
        this.next = null;
    }
    public QueueNode(){}
    public int getDate(){
        return this.data;
    }
    public QueueNode getNext(){
        return next;
    }
}
