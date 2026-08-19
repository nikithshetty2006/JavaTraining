package august12;

public class Exception2 {
    public static void main(String[] args){
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("You cannot divide a number by zero");
        }
        finally
        {
            System.out.println("Done!!");
        }
    }
}
