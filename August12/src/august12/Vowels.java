package august12;

public class Vowels {
    public static void main(String[] args) {
        String name="Dragon";
        String name1=name.toLowerCase();
        int count=0;
        for(int i=0;i<name1.length();i++)
        {
            char ch=name1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count+=1;
            }
        }
        System.out.println(name+" has count of "+count+" Vowels!");
    }
}
