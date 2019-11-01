package UniqueNumberofOccurrences1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/unique-number-of-occurrences/
 * @date 2019/11/1
 */
public class Solution01 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] len = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                Integer value = map.get(arr[i]);
                map.remove(arr[i]);
                map.put(arr[i], ++value);
            } else {
                map.put(arr[i], ++len[i]);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()
             ) {
            Integer value = entry.getValue();
            if (!set.contains(value)) {
                set.add(value);
            } else {
                return false;
            }
        }
        return true;
    }
}
