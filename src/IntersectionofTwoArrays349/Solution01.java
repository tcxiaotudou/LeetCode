package IntersectionofTwoArrays349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * @date 2019/10/28
 */
public class Solution01 {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Arrays.stream(nums1).forEach(e -> set1.add(e));
        Set<Integer> set2 = new HashSet<>();
        Arrays.stream(nums2).forEach(e -> set2.add(e));
        int count = set1.size();
        Set<Integer> temp = new HashSet<>();
        for (Integer num: set2
             ) {
            set1.add(num);
            if (set1.size() == count) {
                temp.add(num);
            }
            count = set1.size();
        }
        int n = 0;
        int[] result = new int[temp.size()];
        for (Integer num: temp
             ) {
            result[n++] = num;
        }
        return result;
    }
}
