package AddDigits258;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/add-digits/
 * @date 2019/10/29
 */
public class Solution01 {

    public int addDigits(int num) {
        int temp = add(num);
        while (String.valueOf(temp).length() > 1) {
            temp = add(temp);
        }
        return temp;
    }

    public int add(int num) {
        String s = String.valueOf(num);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result + s.charAt(i)-'0';
        }
        return result;
    }

//    public int addDigits(int num) {
//        return (num - 1) % 9 + 1;
//    }
}
