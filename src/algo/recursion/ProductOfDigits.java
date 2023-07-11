package algo.recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = productOfDigit(1432);
        System.out.println(ans);
    }

    private static int productOfDigit(int n) {
        if(n%10 == n){                           /* On last 1/10 will give <0 and 1%10 will give n */
            return n;
        }
        return n%10 * productOfDigit(n/10); /* n%10 will be 2 &  N/10 will be 143 */

    }
}
