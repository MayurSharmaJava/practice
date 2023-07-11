package algo.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sumOfDigit(1432);
        System.out.println(ans);
    }

    private static int sumOfDigit(int n) {
        if(n<=0){                           /* On last 1/10 will give < 0 */
            return 0;
        }
        return n%10 + sumOfDigit(n/10); /* n%10 will be 2 &  N/10 will be 143 */

    }
}
