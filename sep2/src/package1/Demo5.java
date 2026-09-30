package package1;

import java.util.Collection;
import java.util.Comparator;

public class Demo5 {
    public static void main(String[] args){
        void bubble_sort(int a[])
        {
            for(int i=0;i<=a.length;i++)
            {
                for(int j=0;j<a.length-1-i;j++)
                {
                    if(a[j]>0[j+1])
                    {
                        int temp=a[i];
                        a[i]=a[i+1];
                        a[i+1]=temp;
                    }
                }
            }
            return a;
        }
    }
}
