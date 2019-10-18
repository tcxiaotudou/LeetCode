package HammingDistance461;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/hamming-distance/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 11:49
 * @Version 1.0
 */
public class Solution01 {

    public static int hammingDistance(int x, int y) {
        int result = 0;
        int num = x ^ y;
        String s = Integer.toBinaryString(num);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}
