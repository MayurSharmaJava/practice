package algo.recursion;

/**
 * Reduce Number to zero using below 2 steps
 * 1. if even divide by 2
 * 2. odd substract 1
 * Count the number of steps needed
 */
public class CountStepsToReduceNumberToZero {
    public static void main(String[] args) {
        int ans = stepsCounter(41,0);
        System.out.println(ans);
    }

    public static int stepsCounter(int num, int steps){
        if(num==0){
            return steps;
        }
        if(num%2 == 0){
            num = num/2;
        }
        else{
            num -= 1;
        }
        return stepsCounter(num,++steps);
    }
}
