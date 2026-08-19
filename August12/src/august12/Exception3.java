package august12;


public class Exception3 {
    public static void main(String[]args){
        //null pointer exception

        String a= null;
        System.out.println(a.length());

        //Array Index out of bound Exception
        int arr[]={10,20,30};
        System.out.println(arr[5]);

    }
}
