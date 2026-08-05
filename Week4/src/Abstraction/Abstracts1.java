package Abstraction;
//abstraction-2 ways
//1.abstract classes and meyhods
//2.interface

//abstract class and methods

abstract class Nsam{
    abstract void cse_dept();
    void com_dept(){
        System.out.println("from com dept");
    }
}
class Students extends Nsam{

    @Override
    void cse_dept() {
        System.out.println("students from cse dept");
    }
}
public class Abstracts1 {
    public static void main(String[] args){
        //Nsam n=new Nsam
        Students s=new Students();
        s.cse_dept();
        s.com_dept();
    }
}
