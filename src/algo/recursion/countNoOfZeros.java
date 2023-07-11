package algo.recursion;

public class countNoOfZeros {
    public static void main(String[] args) {
        System.out.println(countZero(100234001, 0));
    }

    private static int countZero(int n, int count) {
        if(n == 0) {
            return count;
        }

        int lastNumber   = n % 10;
        int remainingDig = n/10;

        if(lastNumber==0){
            return countZero(remainingDig, ++count);
        }else{
            return countZero(remainingDig, count);
        }

    }
}
