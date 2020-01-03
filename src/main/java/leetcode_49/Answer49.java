package leetcode_49;

import java.util.*;

/**
 * @Auther: Chen Hao
 * @Date: 2020/1/3
 * @Description: 字母异位词分组
 */
public class Answer49 {
    public List<List<String>> groupAnagrams(String[] strs){
        if(strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            //先将String转为char数组进行排序
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            //valueOf方法将其他类型转换为String表示
            String temp = String.valueOf(chars);
            //这里的ArrayList的泛型参数和最后位置可加可不加，不写String也对
            if(!map.containsKey(temp)) map.put(temp, new ArrayList<String>());
            //向对应List增加str后无需再调用set方法更新
            map.get(temp).add(str);
        }
        //map.values()将map转为一个Collection的表示，并直接调用ArrayList的构造方法
        return new ArrayList<>(map.values());
    }
}
