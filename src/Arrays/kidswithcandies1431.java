package Arrays;

import java.util.List;

public class kidswithcandies1431 {
    public static void main(String[] args) {

    }
    static List<Boolean> kidscandies(int[] candies, int extracandies){
        Boolean[] arr = new Boolean[candies.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extracandies>=max){
                arr[i] = true;
            }
            else{
                arr[i] = false;
            }
        }
        return List.of(arr);
    }
}
