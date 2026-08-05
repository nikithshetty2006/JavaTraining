package Inheritances;

class Nitte{
    void display(){
        System.out.println("college");
    }
}
class Nsam extends Nitte{
    void nsam_details(){
        System.out.println("nsam clg");
    }
}
class Nmamit extends Nitte{
    void nmamit_details(){
        System.out.println("nmamit clg");
    }
}
class jksam extends Nitte{
    void jksam_details(){
        System.out.println("jksam clg");
    }
}
public class Inherit2 {
    public static void main(String[] args){
        Nitte n=new Nitte();
        n.display();
//        Nsam n1=new Nsam();
//        n1.nsam_details();
//        n1.display();
    }
}
