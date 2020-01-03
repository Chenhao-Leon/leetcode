package leetcode_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/3
 * @Description: 字母异位词分组
 */
public class Solution49 {
    private List<char[]> letterSet = new ArrayList<>();
    private int nullIndex = -1;
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> res = new ArrayList<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            int index;
            if(chars.length == 0)
                index = nullIndex;
            else
                index = findLetterSet(chars);
            if(index < 0){
                if(chars.length == 0)
                    nullIndex = letterSet.size();
                letterSet.add(chars);
                List<String> list = new ArrayList<>();
                list.add(str);
                res.add(list);
            }
            else{
                List<String> list = res.get(index);
                list.add(str);
                res.set(index, list);
            }
        }
        return res;
    }

    private int findLetterSet(char[] chars){
        for(int j = 0; j < letterSet.size(); j++){
            char[] temp = letterSet.get(j);
            int i;
            for(i = 0; i < chars.length; i++){
                if(i >= temp.length) break;
                if(temp[i] != chars[i]) break;
            }
            if(temp.length > chars.length) continue;
            if(i == chars.length) return j;
        }
        return -1;
    }
}
