package Search;

public class binarysearch {
    public static void main(String[] args){
        int[] arr = {-18,-10,-5,-3,2,3,4,5,6,18,22,78,99};
        int target = 22;
        int ans = binarysearchs(arr,target);
        System.out.println(ans);
    }
    static int binarysearchs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            // find middle element
            int mid = start + (end-start) / 2;

            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{ // ans found
                return mid;
            }
        }
        return -1;
    }
}
