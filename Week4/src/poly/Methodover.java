package poly;
class parents{
    int x=10;
    void display(){
        System.out.println("from parent class");
    }
}
class child extends parents{
    void print(){
        System.out.println(super.x);
        super.display();
    }

}
public class Methodover {
    public static void main(String[] args){
        child c=new child();
        c.print();

    }


}
