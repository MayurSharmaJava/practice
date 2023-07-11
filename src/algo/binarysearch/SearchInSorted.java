package algo.binarysearch;

public class SearchInSorted {
    public static void main(String[] args) {
        SearchInSorted solution = new SearchInSorted();
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = solution.search(arr, target);
        System.out.println(ans);

    }

    public int search(int[] arr,int target){
        int start=0;
        int end= arr.length - 1;

        while(start <= end){

            int mid = start + (end-start) / 2;

            if(arr[mid]<target){
                start = mid+1;              //-- search right

            }
            else if(arr[mid]>target){
                end = mid-1;                //-- search left

            }
            else{
                return mid;                 //-- return found
            }

        }

        return -1;
    }
}
