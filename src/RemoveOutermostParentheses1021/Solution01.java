package RemoveOutermostParentheses1021;

import java.util.Stack;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/remove-outermost-parentheses/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/17 17:10
 * @Version 1.0
 */
public class Solution01 {
    public String removeOuterParentheses(String S) {
        int start = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push('(');
            }else {
                stack.pop();
                if (stack.isEmpty()) {
                    sb.append(S, start + 1, i);
                    start = i + 1;
                }
            }
        }
        return sb.toString();
    }
}
