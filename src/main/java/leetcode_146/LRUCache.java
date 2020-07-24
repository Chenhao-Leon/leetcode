package leetcode_146;

import java.util.HashMap;

public class LRUCache {
    class Node {
        public int key;
        public int val;
        public Node next;
        public Node before;

        public Node (int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private int capacity;
    private int size = 0;
    private HashMap<Integer, Node> map;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.before = head;
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            Node node = map.get(key);
            removeKey(key);
            addNodeToTail(node);
            //注意：addNodeToTail方法从map中移除了key，因此还要重新加入
            map.put(key, node);
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            //注意这里需要将节点连到尾部
            Node node = map.get(key);
            node.val = value;
            get(key);
        } else {
            Node node = new Node(key, value);
            if(size >= capacity) {
                removeKey(head.next.key);
            } else {
                size++;
            }
            addNodeToTail(node);
            map.put(key, node);
        }
    }

    private void addNodeToTail(Node node) {
        Node tmp = tail.before;
        tmp.next = node;
        node.before = tmp;
        node.next = tail;
        tail.before = node;
    }

    private int removeKey(int key) {
        if(!map.containsKey(key)){
            return -1;
        } else {
            Node node = map.get(key);
            Node tmp = node.before;
            tmp.next = node.next;
            node.next.before = tmp;
            map.remove(key);
            return 1;
        }
    }
}
