package sep30;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        String s="2 3 + 6 4 -";
        String sr[]=s.split(" ");//["2","3","+","6","4","-"]
        for(String value:sr) {
            if(value.matches("[0-9]+")){
                stack.push(Integer.parseInt(value));
            }
            else{
                int a=stack.pop();//second operand--->4
                int b=stack.pop();//first operand--->6
                switch (value){
                    case"+"->stack.push(b+a);
                    case"-"->stack.push(b-a);
                    case"*"->stack.push(b*a);
                    case"/"->stack.push(b/a);
                }
            }
        }
        for (int i=stack.size()-1;i>=0;i--){
            System.out.println(stack.get(i));
        }
    }
}
