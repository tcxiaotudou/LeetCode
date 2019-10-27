package FindCommonCharacters1002;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/find-common-characters/
 * @date 2019/10/27
 */
public class Solution01 {

    public List<String> commonChars(String[] A) {
        List<String> list =new ArrayList<String>();
        char[][] chars = new char[A.length][26];
        for(int i = 0;i <A.length;i++){
            for(int j = 0;j < A[i].length();j++){
                chars[i][A[i].charAt(j)-'a'] += 1;
            }
        }
        for(int i = 0;i < 26;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < A.length;j++){
                if(chars[j][i]<min){
                    min = chars[j][i];
                }
            }
            for(int t = 0;t < min;t++){
                list.add(String.valueOf((char)('a'+i)));
            }
        }
        return list;
    }
}
