package algo.binarysearch;

public class FindCeiling {
    public static void main(String[] args) {
        FindCeiling findCeiling = new FindCeiling();

        int[] arr = {2, 3, 5, 9, 14, 15, 16, 18};
        int target = 15;
        int ans = findCeiling.search(arr, target);
        System.out.println(ans);
    }

    private int search(int[] arr, int target) {

        int start=0;
        int end= arr.length - 1;
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
                return arr[mid+1];           //--found return Next element
            }

        }

        return arr[start];                  //-- Not found : return next
    }
}
