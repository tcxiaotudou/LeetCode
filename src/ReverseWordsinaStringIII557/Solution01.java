package ReverseWordsinaStringIII557;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/21 11:23
 * @Version 1.0
 */
public class Solution01 {

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        String[] array = sb.reverse().toString().split(" ");
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        String result = String.join(" ", list);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
