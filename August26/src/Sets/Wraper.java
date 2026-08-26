package Sets;

public class Wraper {
    public static void main(String[] args) {
        int a=1;
        Integer b=1;
        // Auto boxing---Primitive--->Wrapper class obj
        int x=10;
        Integer y=x;
        y.toString();//20----'20'

//        int z=1000;
//        Integer p=new Integer(1);
        Integer i=Integer.valueOf(10);
        System.out.println(i);

        int x2=20;

        Integer count=5;
        //primitive int value
        int ab=10;
        //converting to Integer wrapper object
        Integer obj=10;//auto boxing(automatic(
        Integer ob=new Integer(30);//Explicit
        Integer Obj=Integer.valueOf(10);//Method way

    }
}
