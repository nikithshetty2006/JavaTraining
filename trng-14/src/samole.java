public class samole {
    static class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            next=null;
        }
    }
    node head;
    void add(int data){
        node newnode= new node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newnode;
    }
    void add_begin(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
    }
    void delete(int data)
    {
        if(head==null){
            System.out.println("LIst is Empty");
            return;
        }
        if(head.data==data){
            System.out.println("REmoving..:"+head.data);
            head=head.next;
            return;
        }
        node current=head;
        while (current.next!=null && current.next.data!=data)
        {
            current=current.next;
        }
        System.out.println("REmoving..."+current.next.data);
        current.next=current.next.next;
    }
    void display()
    {
        node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        samole list=new samole();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.display();
        list.add_begin(5);
        list.display();
        list.add_begin(45);
        list.display();
        list.delete(45);
        list.display();


    }
}
