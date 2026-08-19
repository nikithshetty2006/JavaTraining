package august12;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception1 {

    static void readfile() throws FileNotFoundException {
        FileReader fr = new FileReader("sample.txt");
    }
    public static void main(String[] args){
        try {
            readfile();
            System.out.println("File opened");

        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        System.out.println("done");

    }

}
