package sep30;

public class Que {
    int queue[];
    int front;
    int rear;
    int capacity;
    Que(int capacity){
        queue=new int[capacity];
        front=0;
        rear=-1;
    }
    void add(int data){
        if(rear==queue.length-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear]=data;
    }
    int poll(){
        if(front>rear){
            System.out.println("Queue is empty");
            return -1;
        }
        int value= queue[front];
        front++;
        return  value;
    }
    int peek(){
        if(front>rear){
            System.out.println("Queue is empty");
            return -1;
        }
        System.out.println("Queue element at front");
        int value= queue[front];
        return  value;
    }

    void display(){
        System.out.println("Queue elements");
        for(int i=front;i<rear;i++){
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        Que q1=new Que(5);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        System.out.println(q1.peek());
        q1.display();
        System.out.println("removed"+q1.poll());

    }
}
