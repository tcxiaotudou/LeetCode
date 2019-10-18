package FlippinganImage832;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/flipping-an-image/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 12:09
 * @Version 1.0
 */
public class Solution01 {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int end = A[i].length - 1;
            for (int j = 0; j < A[i].length / 2;) {
                swap(A[i], j++, end--);
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }

    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

//    1 1 0   0 1 1   1 0 0
//    1 0 1   1 0 1   0 1 0
//    0 0 0   0 0 0   1 1 1
}
