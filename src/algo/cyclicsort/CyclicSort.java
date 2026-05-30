package algo.cyclicsort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        CyclicSort obj = new CyclicSort();
        int[] arr = {3,7,6,5,2,1,4};
        obj.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr) {
        int i = 0 ;
        while(i< arr.length){
            int correctIndex = arr[i]-1;//-- 2
            if(i!=correctIndex){

                swap(arr, i, correctIndex);

            }else{
                i++;
            }
        }
    }

    private void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

}
