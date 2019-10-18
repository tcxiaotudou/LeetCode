package SelfDividingNumbers728;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/self-dividing-numbers/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 16:12
 * @Version 1.0
 */
public class Solution01 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (; left <= right; left++) {
            if (isSelfDividingNumbers(left)) {
                result.add(left);
            }
        }
        return result;
    }

    public boolean isSelfDividingNumbers(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if (s.charAt(i) == '0' || ( n % num != 0)) {
                return false;
            }
        }
        return true;
    }
}
