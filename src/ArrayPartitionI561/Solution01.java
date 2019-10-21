package ArrayPartitionI561;

import java.util.Arrays;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/array-partition-i/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/21 14:09
 * @Version 1.0
 */
public class Solution01 {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}
