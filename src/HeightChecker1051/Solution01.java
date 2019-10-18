package HeightChecker1051;

import java.util.Arrays;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/height-checker/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 15:02
 * @Version 1.0
 */
public class Solution01 {

    public int heightChecker(int[] heights) {
        int result = 0;
        int[] temp = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            if (temp[i] != heights[i]) {
                result++;
            }
        }
        return result;
    }
}
