package Arrays;

public class maxproductinarr1464 {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4};;
        int ans = max(nums);
        System.out.println(ans);
    }
    static int max(int[] nums){
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){

            for(int j =0; j<i; j++){

                if((nums[i]-1)*(nums[j]-1) > ans){

                    ans =(nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return ans;
    }
}
