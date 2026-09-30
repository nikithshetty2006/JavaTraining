package sep15;


public class pallindrome {
    static boolean check(String s){
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="nun";
        boolean res=check(s);
        System.out.println(res);
    }
}
