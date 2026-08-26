package Que;

//functional interface--->one method;


interface Nsam{

    void cal(int a, int b);
//    void cse();
//    void ece();
}

//class student implements Nsam{
//    public void cse(){
//        System.out.println("students from cse dept");
//    }
//}

public class Sample1 {
    public static void main(String[] args) {
        Nsam n=(int x,int y)->{
            System.out.println("sum"+(x+y));
        };
//        Nsam n=new Nsam() {
//            @Override
//            public void cse() {
//                System.out.println("CSE dept");
//            }
//
//            @Override
//            public void ece() {
//                System.out.println("ece dept");
//            }
//        };
        n.cal(10,20);

        Nsam n1=(int x,int y)->{
            System.out.println("Difference"+(x-y));
        };
        n1.cal(20,10);
        Nsam n2=(int x,int y)->{
            System.out.println("Product"+(x*y));
        };
        n2.cal(5,6);
        Nsam n3=(int x,int y)->{
            System.out.println("Division"+(x/y));
        };
        n3.cal(25,5);

    }
}
