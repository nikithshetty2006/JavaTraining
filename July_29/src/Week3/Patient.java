package Week3;

public class Patient {
    String p_id;
    String p_name;

    Patient(String p_id,String p_name){
        this.p_id=p_id;
        this.p_name=p_name;
        System.out.println("constructor executed");
    }
    Patient(){
        System.out.println("Constructor with zero paraneter!");
    }
    Patient(int a){
        this.a=a;
        System.out.println(a);
    }
    public static void main(String[]args){
        Patient p1=new Patient("poo1","qwerty");
        //constructor=used to initialize the subjects of the class
        //types- defAult and parameterized
    }
}

