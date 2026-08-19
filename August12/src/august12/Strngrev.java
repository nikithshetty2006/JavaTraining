package august12;

public class Strngrev {
    public static void main(String[] args){
        String name="NIKITH";
        String rev="";
        int n=name.length();
        for(int i=n-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("Original String is:"+name);
        System.out.println("Reversed String is:"+rev);
    }
}
