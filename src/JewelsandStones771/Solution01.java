package JewelsandStones771;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/jewels-and-stones/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/17 16:21
 * @Version 1.0
 */
public class Solution01 {

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i = 0; i < S.length(); i++) {
            if (J.contains(String.valueOf(S.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}
