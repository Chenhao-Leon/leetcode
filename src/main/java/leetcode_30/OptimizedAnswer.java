package leetcode_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Chen Hao
 * @Date: 2019/12/18
 * @Description: 串联所有单词的子串(优化双HashMap法)
 */
// 这个高效答案是前面双HashMap的优化，主要对windliang发表的“详细通俗的思路分析，多解法”中第2种情况的优化，
// 并且由此在循环最外侧又套了一层。
// 因为j的循环中步幅为wordLength(野蛮匹配模式)，步幅过大，增加外层循环以避免j+1、j+2 这些单词匹配不到
public class OptimizedAnswer {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (words.length == 0 || s.length() < words.length * words[0].length()) {
            return result;
        }

        // 存放单词的 Map
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // 单词数量
        int count = words.length;
        // 每个单词长度
        int wordLength = words[0].length();

        // 遍历单词的长度，因为 j+wordLength 可能回导致 j+1，j+2 这些单词匹配不到
        for (int i = 0; i < wordLength; i++) {
            // 遍历字符串，每次遍历 j 的值都加上单词的长度
            for (int j = i; j <= s.length() - wordLength * count; j += wordLength) {
                Map<String, Integer> matchWordMap = new HashMap<>();
                // 根据单词的个数进行遍历，倒序遍历，可以减少不匹配时的匹配次数
                for (int k = count - 1; k >= 0; k--) {
                    // 取出当前的单词
                    String word = s.substring(j + k * wordLength, j + (k + 1) * wordLength);
                    // 取出已经匹配的该单词数量
                    int value = matchWordMap.getOrDefault(word, 0) + 1;
                    // 如果该单词的匹配数量超过实际需要匹配的次数，结束匹配
                    if (value > wordMap.getOrDefault(word, 0)) {
                        // j 需要加上当前已经匹配的字符串长度，防止重复的单词出现
                        j += k * wordLength;
                        break;
                    }
                    // 最后一个匹配成功
                    if (k == 0) {
                        result.add(j);
                    } else {
                        // 将该单词插入 map
                        matchWordMap.put(word, value);
                    }
                }
            }
        }
        return result;
    }

}
