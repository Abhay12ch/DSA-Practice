package Arrays;
// leetcode 1295 easy find even no of digits in the given array
public class evennodigits1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = countevendigit(nums);
        System.out.println(ans);
    }
    static int countevendigit(int[] nums){
        int count = 0;
        for ( int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int noofdigit = digits(num);
        if(noofdigit%2==0){
            return true;
        }
        return  false;
        // shortcut is : return noofdigit%2==0;
    }
    static int digits(int num){
        int count = 0;

        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
