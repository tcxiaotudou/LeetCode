package TransposeMatrix867;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/transpose-matrix/
 * @date 2019/10/30
 */
public class Solution01 {

    public int[][] transpose(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] B = new int[n][m];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
}
