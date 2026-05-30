package algo.cyclicsort;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        FindMissingNumber obj = new FindMissingNumber();
        int[] arr = {3,7,5,2,1,4};
        int missing = obj.findMissing(arr);
        System.out.println("Missing="+missing);
    }

    private int findMissing(int[] arr) {
        arr = sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;  /** -1 as input is 1based not zero based **/
            }
        }
        return arr.length-1; /** if all are at correct place means only last element is missing **/
    }

    private int[] sort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1; /** -1 as input is 1-N not 0-N **/
            if(i!=correctIndex && correctIndex<arr.length){ /** NOTE condition for Correct index < length To avoid array Out of bound as one number is Missing**/
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
