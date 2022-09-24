package algo.binarysearch;

/**
 * Mountain Array : Increasing in 1st half and Decrease in 2nd half
 */
public class SearchPeakInMountainArray {
    public static void main(String[] args) {
        SearchPeakInMountainArray solution = new SearchPeakInMountainArray();
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 2, 1, 0};
        int ans = solution.search(arr);
        System.out.println(ans);

    }

    public int search(int[] arr){

        int start=0;
        int end= arr.length - 1;

        int mid = -1;

        while(start < end){

            mid = start + (end-start) / 2;


            if(arr[mid] < arr[mid]+1){      //-- Asc part of Array -- Next element is larger:
                start = mid+1;              //-- search right

            }
            else if(arr[mid] > arr[mid]+1){ //-- Desc part of Array -- next element is smaller:
                end = mid;                  //-- search left

            }

        }

        return start;
    }
}
