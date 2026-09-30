package sep23;

import java.util.Arrays;

public class Sample1 {
    public static void main(String[] args) {
//        String s="java python c++ c";
//        String sr[]=s.split(" ");
//
//        System.out.println(Arrays.toString(sr));
//        System.out.println("Name:"+sr[0]);
//        System.out.println("Age:"+sr[1]);
//        System.out.println("dept:"+sr[2]);
//        System.out.println("SAl:"+sr[3]);
//
//        String ph="123-456-7890";
//        //replace
//        //particular char in a string
//        //string in onr sentence
//
//        String s1="Java";
//        System.out.println(ph.replace("-",""));
//
//        String a="<p>Hello</p><p>World<p>";
//        String a1= a.replace("<p>"," ").replace("</p>"," ");
//        System.out.println(a1);

        //[A-Z],[a-z],[0-9],..,*,[A-Z]+
        //\\d,\s,\w(letters,digits,_)
//        String x="sdfg345sdfgv78";
//        System.out.println(x.replaceAll("\\d"," "));
//        String y="A1234565asdfg";
//        System.out.println(y.matches(".[0-9].*"));

//        String a="1JAVA";
//        System.out.println(a.matches("^[0-9].*"));//^ means begins
//        String a1="16515@#";
//        System.out.println(a1.matches("[^A-Z,a-z,0-9]"));//^ inside[] means not

//        String z="java@gmail.com";
//        System.out.println(z.replaceAll("[^a-z]",""));
        //substring(start,end)
        //"Jhon DEo Smith"
        //jaya@gmail.com-->gmail.com
//        String q="Jhon Deo Smith";
//        int start=q.indexOf(" ")+1;
//        int end=q.lastIndexOf(" ");
//        System.out.println(q.substring(start,end));
//
//        String w="jaya@gmail.com";
//        int start1=q.indexOf("@")+1;
//        System.out.println(w.substring(start));

//        String a="Java";
//        String b="python";
//        System.out.println(a.concat(b));//covat wi not take different data types
//        System.out.println(a+151);

//        String branches[]={"Java","python","linux","c"};
//        String res=String.join("-",branches);
//        System.out.println(res);
//        String a="Dhanlakshmi";
//        System.out.println(a.matches("^[A-Z].*"));
//        String b="2655515";
//        System.out.println(b.matches("[^0-9].*"));
        //validate the given password
        //1.it should have capital and small letter
        //2.0-9
        //3.special characters
        //length>0
        // if passes all conditions -->Strong else weak
        String pass="Niki2006#64s";

        if (pass.length()>10){
            boolean q=pass.matches(".*[^A-Z,a-z,0-9].*");
            boolean x= pass.matches(".*[A-Z,a-z,0-9].*");
            //.* is used to indicate there are other characters
            if(x && q){
                System.out.println("Strong password");
            }
            else {
                System.out.println("weak password");
            }
        }
        else {
            System.out.println("Invalid password");
        }

    }
}
