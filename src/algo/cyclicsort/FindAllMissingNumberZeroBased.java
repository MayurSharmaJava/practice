package algo.cyclicsort;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllMissingNumberZeroBased {
    public static void main(String[] args) {
        FindAllMissingNumberZeroBased obj = new FindAllMissingNumberZeroBased();
        int[] arr = {0,7,2,1,2,2,1,1};
        ArrayList<Integer> missing = obj.findMissing(arr);
        System.out.println("Missing="+missing);
    }

    private ArrayList<Integer> findMissing(int[] arr) {
        arr = sort(arr);
        System.out.println("sorted: "+ Arrays.toString(arr));
        ArrayList<Integer> missing = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                missing.add(i);
            }
        }
        return missing;
    }

    private int[] sort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(i!=correctIndex
                   && arr[correctIndex]!=arr[i] /** When element contains Duplicates **/
                   && correctIndex<arr.length){ /** NOTE condition for Correct index < length To avoid array Out of bound as one number is Missing**/
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
