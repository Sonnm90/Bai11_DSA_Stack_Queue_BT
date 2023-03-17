package BT3;

public class MyQueue {
    private Node front, rear;

    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
        }
            this.rear.link = this.front;
        this.rear = newNode;

    }

    public int dequeue() {
        if (this.front == null) {
            throw new IllegalStateException("Hang doi null");
        }
        int data = this.front.getData();
        if (this.front == null) {
            this.rear = null;
        }
        this.front=this.front.link;
        return data;
    }
    public void displayData(){

    }


}
