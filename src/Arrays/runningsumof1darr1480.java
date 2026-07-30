package Arrays;

import java.util.Arrays;

public class runningsumof1darr1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,};
        int[] ans = runningsum(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] runningsum(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
