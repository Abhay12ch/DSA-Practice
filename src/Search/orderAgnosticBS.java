package Search;
// complexity is O(logn)
public class orderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-18,-10,-5,-3,2,3,4,5,6,18,22,78,99};
        int[] arr = {99,80,75,22,11,10,5,2,-3};
        int target = 22;
        int ans = agnosticBS(arr,target);
        System.out.println(ans);

    }
    static int agnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        // find whether the arr is sorted in asc or descending
        boolean isAsc = arr[start]<arr[end];




        while(start <= end){
            // find middle element
            int mid = start + (end-start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
