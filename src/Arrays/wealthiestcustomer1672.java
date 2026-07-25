package Arrays;

public class wealthiestcustomer1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int ans = maxwealth(accounts);
        System.out.println(ans);
    }
    static int maxwealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum>max){
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
