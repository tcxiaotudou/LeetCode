package DIStringMatch942;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/di-string-match/
 * @date 2019/10/23
 */
public class Solution01 {

    public int[] diStringMatch(String S) {
        int length = S.length();
        int[] result = new int[S.length() + 1];
        int x = 0, y = length;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == 'I') {
                result[i] = x++;
            } else if (S.charAt(i) == 'D') {
                result[i] = y--;
            }
        }
        result[length] = x;
        return result;
    }
}
