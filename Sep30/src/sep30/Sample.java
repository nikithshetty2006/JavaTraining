package sep30;

import java.sql.SQLOutput;

public class Sample {
    int stack[]=new int[5];
    int top=-1;
    void push(int data){
        if(top== stack.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top]=data;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("Stack after pop");
        int value=stack[top];
        top--;
        return value;
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }

        System.out.println("Elements in stack");
        int value=stack[top];
        return value;

    }
    void display(){
        for (int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        Sample s1=new Sample();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.display();
        s1.pop();
        s1.display();
    }
}
//23+64- ...