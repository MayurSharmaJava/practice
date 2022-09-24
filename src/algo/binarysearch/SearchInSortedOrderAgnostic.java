package algo.binarysearch;

/**
 * Logic :
 * last > 1st =  Asc
 * Last < 1st =  Desc
 */
public class SearchInSortedOrderAgnostic {
    public static void main(String[] args) {
        SearchInSortedOrderAgnostic solution = new SearchInSortedOrderAgnostic();
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 4;

        boolean isAscOrder = false;
        if(arr[arr.length-1]>arr[0]){
            isAscOrder = true;
        }
        int ans = solution.search(arr, target,isAscOrder);
        System.out.println(ans);

    }

    public int search(int[] arr,int target, boolean isAscOrder){

        int start=0;
        int end= arr.length - 1;

        while(start <= end){

            int mid = start + (end-start) / 2;

            if(arr[mid]==target){
                return mid;                 //-- return found
            }

            if(isAscOrder) {
                if (arr[mid] < target) {
                    start = mid + 1;              //-- search right
                } else if (arr[mid] > target) {
                    end = mid - 1;                //-- search left
                }
            }else{
                if (arr[mid] > target) {
                    start = mid + 1;              //-- search right
                } else if (arr[mid] < target) {
                    end = mid - 1;                //-- search left
                }
            }

        }

        return -1;
    }
}
