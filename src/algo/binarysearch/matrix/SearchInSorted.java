package algo.binarysearch.matrix;

import java.util.Arrays;

/**
 *      0	1	2	3
 * 0	10	20	30	40
 * 1	15	25	35	45
 * 2	28	29	37	49
 * 3	33	34	38	50
 *
 * Try to Eliminate rows or columns
 *
 * Logic:
 * While ( Row < matrix.length    &&    Cloumn > 0 )
 *      Pick last column and 1st Row (0,3) = 40
 *      40 > 37
 *      Eliminate entire Column (as matrix is sorted column wise so all element in column will be >37)
 * Now, Column becomes 2
 *      Pic (0,3) = 30
 *      30 < 37
 *      Eliminate Entire Row (as Matrix is sorted Row wise so all element in row will be < 37)
 * Now, Row becomes 1
 *      Pic(1,3) = 35
 *      35 < 37
 *      Eliminate Entire Row
 * Now, Row becomes 2
 *      Pic(2,3) = 37
 *      37 == 37
 * Yes Found
 */

public class SearchInSorted {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38 ,50}
        };
       int[] ans = search(matrix, 37);
       System.out.println(Arrays.toString(ans));
        
    }

    private static int[] search(int[][] matrix, int target) {
        int c = matrix[0].length-1; //-- columns
        int r = 0; //-- starting from 0

        while (c > 0  && r < matrix.length-1 ){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            else if(matrix[r][c] > target){
                c--;
            }else if(matrix[r][c]<target){
                r++;
            }
        }

        return new int[]{-1,-1};
    }
}
