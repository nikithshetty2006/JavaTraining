package Streams;

import java.util.ArrayList;

class employe{
    int age;
    String name;
    String dept;
//    public employe(int age, String name,String dept){
//        this
//    }


    public employe(int age, String name, String dept) {
        this.age = age;
        this.name = name;
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public String getDept() {
        return dept;
    }
}


class Product1{
    
}
public class Sample {
    public static void main(String[] args) {
        ArrayList<employe>list=new ArrayList<>();
        employe e1=new employe(10,"Riya","sales");
        list.add(e1);
        list.add(new employe(20,"Siya","sales"));
        list.add(new employe(30,"ram","finance"));

        for (employe e:list){
            System.out.println(e.getAge()+" "+e.getName()+" "+e.getDept());
        }
        ArrayList<Product1>listp=new ArrayList<>();


    }
}
