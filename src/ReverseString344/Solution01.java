package ReverseString344;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/reverse-string/
 * @date 2019/10/21
 */
public class Solution01 {

    public void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < length/2; i++) {
            char temp = s[i];
            s[i] = s[length - 1 -i];
            s[length - 1 -i] = temp;
        }
    }
}
