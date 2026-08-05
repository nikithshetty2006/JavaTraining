package Inheritances;

class grandparent{
    int z=30;
}
class parent{
    int x=10;
}

class child extends parent{
    int y=20;
}
public class Inheritsample {
    public static void main(String[] args){
        child c=new child();
        System.out.println(c.x);
    }
}
