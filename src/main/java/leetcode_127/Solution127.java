package leetcode_127;

import java.util.*;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/18
 * @Description: 单词接龙 不负众望 超时
 * 时间复杂度 M * N2，M为单词的长度，N为wordList的长度
 */
public class Solution127 {
    private int minSequence = Integer.MAX_VALUE;
    private boolean hasResult = false;
    private LinkedList<String> nowSequence = new LinkedList<>();
    private boolean[] isUsed;
    private Map<String, List<Integer>> map = new HashMap<>();
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        isUsed = new boolean[wordList.size()];
        nowSequence.add(beginWord);
        boolean hasEndWord = false;
        for(String str : wordList){
            if(str.equals(endWord))
                hasEndWord = true;
        }
        if(!hasEndWord) return 0;
        setMap(wordList, beginWord);
        backTrack(beginWord, endWord, wordList);
        return hasResult? minSequence: 0;
    }
    private void setMap(List<String> wordList, String beginWord){
        int size = wordList.size();
        for(int i = 0; i < size; i++){
            List<Integer> list = new LinkedList<>();
            for(int j = 0; j < size; j++){
                if(i == j) continue;
                if(isMatched(wordList.get(i), wordList.get(j)))
                    list.add(j);
            }
            map.put(wordList.get(i), list);
        }
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < size; i++){
            if(isMatched(beginWord, wordList.get(i)))
                list.add(i);
        }
        map.put(beginWord, list);
    }
    private boolean isMatched(String nowWord, String nextWord){
        int count = 0;
        if(nowWord.length() != nextWord.length())
            return false;
        for(int i = 0; i < nowWord.length(); i++){
            if(nowWord.charAt(i) != nextWord.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
    private void backTrack(String beginWord, String endWord, List<String> wordList){
        if(beginWord.equals(endWord) && nowSequence.size() < minSequence){
            minSequence = nowSequence.size();
            hasResult = true;
            return;
        }
        List<Integer> matchList = map.getOrDefault(beginWord, new LinkedList<>());
        for(int index : matchList){
            if(!isUsed[index]){
                isUsed[index] = true;
                nowSequence.add(wordList.get(index));
                backTrack(wordList.get(index), endWord, wordList);
                nowSequence.pollLast();
                isUsed[index] = false;
            }
        }
    }
}
