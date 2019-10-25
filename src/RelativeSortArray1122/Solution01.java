package RelativeSortArray1122;

import java.util.*;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/relative-sort-array/
 * @date 2019/10/25
 */
public class Solution01 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] bucket = new int[1001];
        Arrays.stream(arr1).forEach(e -> {
            bucket[e]++;
        });
        int num = 0;
        for (int i = 0; i < arr2.length; i++) {
            int value = arr2[i];
            while (bucket[value]-- > 0) {
                arr1[num++] = value;
            }
        }
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i]-- > 0) {
                arr1[num++] = i;
            }
        }
        return arr1;
    }
}
