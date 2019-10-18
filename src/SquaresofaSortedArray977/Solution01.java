package SquaresofaSortedArray977;

import java.util.Arrays;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 15:59
 * @Version 1.0
 */
public class Solution01 {

    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
