package august12;

public class Emptystrng {
    public static void main(String[] args) {
        String name="xyz";
        if(name.isEmpty()){
            System.out.println("string is empty");
        }
        else{
            System.out.println("String is not Empty & has "+
                    "the string of length:"+name.length());
        }
    }
}
