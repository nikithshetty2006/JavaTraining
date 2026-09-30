package sep15;

import java.util.HashMap;

public class s1 {
    public static void main(String[] args) {
        int a[]={10,20,30,30,40,50,60,60,20,40};
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int n:a){
            map.put(n, map.getOrDefault(n,0)+1);
        }
  //      for(int i=0;i<a.length;i++)
    //    {
 //           int n = a[i];
//            if(map.containsKey(n)){
//               map.put(n,map.get(n)+1);
//           }
//            else {
//                map.put(n,1);
//            }
//            map.put(n,map.getOrDefault(n,0)+1);
//       }
        System.out.println(map);
    }
}

//public class TwoSumTwoPointers {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int target = 12;
//
//        findTwoSum(arr, target);
//    }
//
//    public static void findTwoSum(int[] arr, int target) {
//        int left = 0;
//        int right = arr.length - 1;
//        boolean found = false;
//
//        while (left < right) {
//            int currentSum = arr[left] + arr[right];
//
//            if (currentSum == target) {
//                System.out.println("Elements found: " + arr[left] + " and " + arr[right]);
//                found = true;
//                // Move both pointers to find other potential pairs, or break if only one pair is needed
//                left++;
//                right--;
//            } else if (currentSum < target) {
//                left++; // Increase sum by moving the left pointer to the right
//            } else {
//                right--; // Decrease sum by moving the right pointer to the left
//            }
//        }
//
//        if (!found) {
//            System.out.println("No two elements sum up to the target value.");
//        }
//    }
//}