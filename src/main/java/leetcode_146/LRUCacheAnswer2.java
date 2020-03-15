package leetcode_146;

import java.util.HashMap;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/15
 * @Description: LRU缓存机制
 */
public class LRUCacheAnswer2 {
    class DeListNode{
        int key;
        int val;
        DeListNode next = null;
        DeListNode pre = null;
        DeListNode(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    private int capacity;
    private int size = 0;
    private DeListNode head = new DeListNode(0, 0);
    private DeListNode tail = new DeListNode(0, 0);
    private HashMap<Integer, DeListNode> map = new HashMap<>();
    LRUCacheAnswer2(int capacity){
        this.capacity = capacity;
        head.next = tail;
        tail.pre = head;
    }
    private void addNode(DeListNode node){
        node.next = head.next;
        head.next.pre = node;
        node.pre = head;
        head.next = node;
    }
    private void removeNode(DeListNode node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
    private DeListNode pollTail(){
        DeListNode tmp = tail.pre;
        tail.pre = tmp.pre;
        tail.pre.next = tail;
        return tmp;
    }
    public int get(int key){
        DeListNode node = map.get(key);
        if(node != null){
            removeNode(node);
            addNode(node);
        }
        return node != null ? node.val : -1;
    }
    public void put(int key, int value){
        DeListNode node = new DeListNode(key, value);
        if(map.get(key) == null){
            map.put(key, node);
            addNode(node);
            size++;
            if(size > capacity) {
                DeListNode tmp = pollTail();
                map.remove(tmp.key);
                size--;
            }
        } else {
            DeListNode tmp = map.get(key);
            tmp.val = value;
            removeNode(tmp);
            addNode(tmp);
        }
    }
}
