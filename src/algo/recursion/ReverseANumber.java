package algo.recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        reverse(1432);
        System.out.println("reversed = "+sum);
    }

    static int sum=0;

    private static void reverse(int n) {
        int remainder   = n%10;     /* last digit    */
        int otherDigits = n/10;     /* remaining part */

        sum *= 10 ;
        sum += remainder;

        if(remainder == n){
           return;                  /* exit condition */
        }

        reverse(otherDigits);
    }
}
