package algo.binarysearch;

public class FindFirstAndLastPosition {

    public static void main(String[] args) {
        FindFirstAndLastPosition obj = new FindFirstAndLastPosition();
        int[] arr = {2, 3, 5, 5, 5, 5, 9, 14, 16, 18};
        int target = 5;

        int startIndex = obj.search(arr, target, true);
        System.out.println(startIndex);

        int endIndex= obj.search(arr, target, false);
        System.out.println(endIndex);

    }

    private int search(int[] arr, int target, boolean findFirst) {

        int start=0;
        int end= arr.length - 1;
        int mid = 0;
        int ans = -1;

        while(start <= end){

            mid = start + (end-start) / 2;

            if(arr[mid]<target){
                start = mid+1;              //-- search right

            }
            else if(arr[mid]>target){
                end = mid-1;                //-- search left

            }
            else{
                //return mid;              //-- DO not return mid when found

                ans = mid;                 //-- this can be potential answer

                if(findFirst)
                    end = mid-1;           //-- continue Loop while moving End to mid -1 & keeping Start constant
                else
                    start = mid+1;         //-- continue Loop while moving start to mid +1 & keeping End constant

            }

        }

        return ans;
    }

}
