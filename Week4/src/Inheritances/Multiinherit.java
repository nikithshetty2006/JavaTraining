package Inheritances;
interface Java{
    void Java();
}
interface Python{
    void python();

}
interface Javascript{
    void javascript();
}
class children implements Java,Javascript,Python{

    @Override
    public void Java() {
        System.out.println("handles Java");
    }

    @Override
    public void javascript() {
        System.out.println("handles Javascript");

    }

    @Override
    public void python() {
        System.out.println("handles Python");

    }
}
public class Multiinherit {
    public static void main(String[] args){
        children c=new children();
        c.Java();
        c.python();
        c.javascript();
    }
}
