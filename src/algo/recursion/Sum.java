package algo.recursion;

public class Sum {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }

    private static int sum(int i) {
        if(i<=1){                   /* Exit Condition */
            return 1;
        }

        return i + sum(i-1);       /* Recursion */
    }
}
