package sep30;

public class Circular {
    int que[];
    int front;
    int rear;
    int capacity;
    int size;
    public Circular(int capacity){
        this.capacity=capacity;
        que=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    void add(int data){
        if(size==capacity){
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%capacity;
        que[rear]=data;
        size++;
    }
    int poll(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }

        int value=que[front];
        que[front]=0;
        front=(front+1)%capacity;
        size--;
        return value;
    }
    void display(){
        System.out.println("Queue elements");
        for(int i=0;i<size;i++){
            System.out.println(que[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Circular q1=new Circular(5);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.display();
        q1.poll();
        q1.poll();
        q1.display();
        q1.add(60);
        q1.display();
        System.out.println("REmoved"+q1.poll());
    }
}
