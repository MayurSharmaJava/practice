package algo.cyclicsort;

public class FindMissingNumberZeroBased {
    public static void main(String[] args) {
        FindMissingNumberZeroBased obj = new FindMissingNumberZeroBased();
        int[] arr = {0,3,7,2,1,4};
        int missing = obj.findMissing(arr);
        System.out.println("Missing="+missing);
    }

    private int findMissing(int[] arr) {
        arr = sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;  /** zero based **/
            }
        }
        return arr.length; /** in ZERO based array : if all are at correct place means only last element is missing **/
    }

    private int[] sort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(i!=correctIndex
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
