package leetcode_127;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/18
 * @Description: 单词接龙（BFS）
 */
import javafx.util.Pair;

import java.util.*;

class Answer127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int L = beginWord.length();
        HashMap<String, ArrayList<String>> allComboDict = new HashMap<String, ArrayList<String>>();
        wordList.forEach(
                word -> {
                    for (int i = 0; i < L; i++) {
                        String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
                        ArrayList<String> transformations =
                                allComboDict.getOrDefault(newWord, new ArrayList<String>());
                        transformations.add(word);
                        allComboDict.put(newWord, transformations);
                    }
                });

        // Queue for BFS
        Queue<Pair<String, Integer>> Q = new LinkedList<Pair<String, Integer>>();
        Q.add(new Pair(beginWord, 1));
        HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
        visited.put(beginWord, true);

        while (!Q.isEmpty()) {
            Pair<String, Integer> node = Q.remove();
            String word = node.getKey();
            int level = node.getValue();
            for (int i = 0; i < L; i++) {

                // Intermediate words for current word
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);

                // Next states are all the words which share the same intermediate state.
                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<String>())) {
                    // If at any point if we find what we are looking for
                    // i.e. the end word - we can return with the answer.
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }
                    // Otherwise, add it to the BFS Queue. Also mark it visited
                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, true);
                        Q.add(new Pair(adjacentWord, level + 1));
                    }
                }
            }
        }

        return 0;
    }
}