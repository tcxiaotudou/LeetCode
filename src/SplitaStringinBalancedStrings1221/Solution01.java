package SplitaStringinBalancedStrings1221;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/17 16:55
 * @Version 1.0
 */
public class Solution01 {

    public int balancedStringSplit(String s) {
        int result = 0, temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L'){
                temp++;
            }else {
                temp--;
            }
            if (temp == 0) {
                result++;
                temp = 0;
            }
        }
        return result;
    }
}
