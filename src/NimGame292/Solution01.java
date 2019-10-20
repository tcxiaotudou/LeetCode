package NimGame292;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/nim-game/
 * @date 2019/10/20
 */
public class Solution01 {

    public boolean canWinNim(int n) {
        if (n % 4 == 0) {
            return false;
        }
        return true;
    }
}
