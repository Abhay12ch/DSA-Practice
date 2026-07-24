package Search;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr,99));
    }
    static boolean search(int[] arr, int target){
        for( int p : arr){
            if(arr[p] == target){
                return true;
            }
            else
                return false;
        }
        return true;
    }
}
