package RobotReturntoOrigin657;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/robot-return-to-origin/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 14:50
 * @Version 1.0
 */
public class Solution01 {

    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                x++;
            }
            if (moves.charAt(i) == 'L') {
                x--;
            }
            if (moves.charAt(i) == 'U') {
                y++;
            }
            if (moves.charAt(i) == 'D') {
                y--;
            }
        }
        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }
}
