package FindWordsThatCanBeFormedbyCharacters1160;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
 * @date 2019/11/4
 */
public class Solution01 {

    public int countCharacters(String[] words, String chars) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        boolean flag = true;
        for (int i = 0; i < chars.length(); i++) {
            set.add(chars.charAt(i));
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    flag = false;
                }
            }
            if (flag) {
                result += words[i].length();
            }
            flag = true;
        }
        return result;
    }
}
