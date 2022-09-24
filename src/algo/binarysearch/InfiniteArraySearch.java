package algo.binarysearch;
/**
 * Binary Search in Infinite Array
 * as this is Infinite can not use length
 *
 * Logic :
 * select Increasing window size from 2 - 4 - 8 - 16 -32 - 64 ....
 * and do binary search in window
 */
public class InfiniteArraySearch {
    public static void main(String[] args) {
        InfiniteArraySearch obj = new InfiniteArraySearch();

        int[] arr = {2, 3, 5, 9, 14, 16, 18, 19, 20, 21, 22, 23 ,25, 26, 27, 28, 29, 30};
        int target = 30;
        //int target = 300;//-- Will give Array Index Out of bound but We Assume that Array is INFINITE then this Exception will not occur.

        /** Sliding & exponentially expanding window Logic **/

        int ans=-1;
        int start=0;
        int end=1;

        while(ans<0) {

            ans = obj.search(arr, target, start, end);

            start = end+1;

            int window_size = end-start+1;

            end = start+(window_size*2);
        }

        System.out.println(ans);
    }

    /** its simple Binary Search **/
    private int search(int[] arr, int target, int start, int end) {
        int mid = 0;

        while(start <= end){

            mid = start + (end-start) / 2;

            if(arr[mid]<target){
                start = mid+1;              //-- search right

            }
            else if(arr[mid]>target){
                end = mid-1;                //-- search left

            }
            else{
                return mid;                 //-- return mid when found
            }

        }

        return -1;
    }
}
