package PeakIndexinaMountainArray852;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/21 10:20
 * @Version 1.0
 */
public class Solution01 {

    // 二分查找也可

    public int peakIndexInMountainArray(int[] A) {
        int result = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i-1] > A[i]) {
                result = i - 1;
                break;
            }
        }
        return result;
    }
}
