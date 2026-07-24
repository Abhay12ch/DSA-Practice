package Search;

import java.util.Arrays;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {12, 3, 5},
                {67, 54, 9,}
        };
        int target = 9;
        int[] ans = search2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search2d(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
