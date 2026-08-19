package august12;

public class Exception4 {
    public static void main(String[] args) {
        int age=-5;
        if(age<=0){
            throw new ArithmeticException("Age cannot be negative");
        }
        System.out.println("Valid age");
    }
}
