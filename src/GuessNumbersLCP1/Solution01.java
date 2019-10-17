package GuessNumbersLCP1;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/guess-numbers/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/17 16:05
 * @Version 1.0
 */
public class Solution01 {

    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                count++;
            }
        }
        return count;
    }
}
