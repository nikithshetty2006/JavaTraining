package interfaces;
//Interface to interface---> extends
//Interface to class--->Implements
//class to class--->Extends

interface Nsam{
    int a=10;
    void cse_dept();
    void com_dept();
    void math_dept();
    void lang_dept();
}
interface Nmamit extends Nsam{
    void ece_dept();
    void civil_dept();
}
class Students implements Nsam,Nmamit{
    @Override
    public void cse_dept() {
        System.out.println("Students from cse dept");
    }

    @Override
    public void com_dept() {
        System.out.println("Students from com dept");
    }

    @Override
    public void math_dept() {
        System.out.println("students from math dept");
    }

    @Override
    public void lang_dept() {
        System.out.println("Students from language dept");

    }

    @Override
    public void ece_dept() {
        System.out.println("Students from ece dept");

    }

    @Override
    public void civil_dept() {
        System.out.println("Students from civil dept");

    }
}

public class S1 {
    public static void main(String[] args){

    }

}
