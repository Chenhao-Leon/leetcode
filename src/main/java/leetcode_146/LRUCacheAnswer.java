package leetcode_146;

import java.util.HashMap;

/**
 * @Auther: Chen Hao
 * @Date: 2020/2/23
 * @Description: 哈希双向链表法 get、put逻辑和我的解法相同，主要是双向链表操作
 */
public class LRUCacheAnswer {
    private HashMap<Integer, Node> map;
    private DoubleList cache;
    private int cap;

    public LRUCacheAnswer(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        int val = map.get(key).val;
        put(key, val);
        return val;
    }

    public void put(int key, int val) {
        Node x = new Node(key, val);

        if (map.containsKey(key)) {
            cache.remove(map.get(key));
            cache.addFirst(x);
            map.put(key, x);
        } else {
            if (cap == cache.size()) {
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            cache.addFirst(x);
            map.put(key, x);
        }
    }
}
