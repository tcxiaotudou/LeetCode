package UniqueMorseCodeWords804;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/unique-morse-code-words/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 11:30
 * @Version 1.0
 */
public class Solution01 {

    public static int uniqueMorseRepresentations(String[] words) {
        String[] array = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < chars.length; j++) {
                sb.append(array[chars[j] - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
