package poly;

public class Poly {
    void add(int a,int b){
        System.out.println("Sum="+(a+b));
    }
    void add(int a,float b){
        System.out.println("sum="+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("sum="+(a+b+c));
    }
    public static void main(String[] args){
        Poly s=new Poly();
        s.add(10,20);
        s.add(10,20.28f);
        s.add(10,20,30);
    }
}
