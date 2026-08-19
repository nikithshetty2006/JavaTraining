package costum;

//Exception class
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
public class Sample {
    static void checkage(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("invalid " +
                    "age it should be greater than 18");
        }
        else {
            System.out.println("Valid age");
        }
    }
    public static void main(String[] args) {
        try{
            checkage(20);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("end of program");
        }
    }
}
