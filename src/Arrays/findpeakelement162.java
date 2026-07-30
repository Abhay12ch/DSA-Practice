package Arrays;

public class findpeakelement162 {
    public static void main(String[] args) {
        int[] nums = {1};
        int ans = peak(nums);
        System.out.println(ans);
    }
    static int peak(int[] nums){
        int index = 0;
        if(nums.length>1) {
            if (nums[0] > nums[1]) {
                index = 0;
            }
            if (nums[nums.length - 1] > nums[nums.length - 2]) {
                index = nums.length - 1;
            }
        }
        for (int i = 1; i <nums.length-1; i++) {
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                index = i;
            }
        }
        return index;
    }
}
