package SingleNumber136;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/single-number/
 * @date 2019/10/26
 */
public class Solution01 {

    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
