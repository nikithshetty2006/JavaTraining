package Maps;

import java.util.HashMap;

public class Demo3 {

    public class Test1{
        public static void main(String[] args)
            String s1="Nsam";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch>=65 && ch<=91)
            {
                res=res+(char)(ch+32);
            }
            else
                res=res+(char)(ch-32);
        }
    }
    System.out.println(res);
}
