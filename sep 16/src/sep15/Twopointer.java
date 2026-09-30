package sep15;

public class Twopointer {

    static int[] findTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                // Return the two elements that add up to the target
                return new int[]{arr[left], arr[right]};
            } else if (currentSum < target) {
                left++; // Move left pointer rightward to increase the sum
            } else {
                right--; // Move right pointer leftward to decrease the sum
            }
        }
        return new int[-1]; // Return empty array if no pair is found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 12;

        int[] res = findTwoSum(arr, target);

        if (res.length == 2) {
            System.out.println("Elements found: " + res[0] + " and " + res[1]);
        } else {
            System.out.println("No pair sums up to the target value.");
        }
    }
}
