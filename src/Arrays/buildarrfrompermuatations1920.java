package Arrays;

public class buildarrfrompermuatations1920 {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,6,7};
    }
    static int[] permutationsarr(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[nums[i]];
        }

        return arr;
    }
}
