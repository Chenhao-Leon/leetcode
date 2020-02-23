package leetcode_146;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/23
 * @Description: LRU缓存机制 时间10%
 */
public class LRUCache {
    private int capacity;
    private Map<Integer, Integer> map = new HashMap<>();
    private int[] queue;
    private int size = 0;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
    }

    public int get(int key) {
        if(map.containsKey(key)){
            updateQueue(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            updateQueue(key);
            map.put(key, value);
            return;
        }
        if(size == capacity) {
            map.remove(queue[0]);
            for (int i = 1; i < size; i++)
                queue[i - 1] = queue[i];
            size--;
        }
        queue[size++] = key;
        map.put(key, value);
    }
    private void updateQueue(int key){
        for(int i = 0; i < size; i++){
            if(queue[i] != key) continue;
            for(int j = i; j < size - 1; j++){
                int tmp = queue[j];
                queue[j] = queue[j + 1];
                queue[j + 1] = tmp;
            }
            break;
        }
    }
}
