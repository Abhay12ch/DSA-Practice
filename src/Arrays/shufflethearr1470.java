package Arrays;

import java.util.Arrays;

public class shufflethearr1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int[] nums, int n){
        int[] arr = new int[nums.length];
        int xp = 0;
        int yp = 0;
        int ans = 0;
        while(xp<n && yp<n){
            arr[ans++] = nums[xp++];
            arr[ans++] = nums[n+yp++];
        }
        return arr;
    }
}
