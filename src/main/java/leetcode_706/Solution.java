package leetcode_706;

/**
 * @Auther: Chen Hao
 * @Date: 2020/9/5
 * @Description:
 */
class MyHashMap {
    private Node[] array;
    private final int capacity = 1000000;

    public MyHashMap() {
        array = new Node[capacity];
    }

    public void put(int key, int value) {
        int hash = key % capacity;
        Node node = new Node(key, value);
        Node p = array[hash];
        while (p != null) {
            if (p.key == key) {
                p.val = value;
                return;
            }
            p = p.next;
        }
        node.next = array[hash];
        array[hash] = node;
    }

    public int get(int key) {
        int hash = key % capacity;
        Node p = array[hash];
        while (p != null) {
            if (p.key == key)
                return p.val;
            p = p.next;
        }
        return -1;
    }

    public void remove(int key) {
        int hash = key % capacity;
        Node p = array[hash];
        if (p == null) return;
        if (p.key == key) {
            array[hash] = p.next;
            p = null;
            return;
        }
        while (p.next != null) {
            if (p.next.key == key) {
                p.next = p.next.next;
                return;
            }
        }
    }
}
class Node {
    int key, val;
    Node next;
    Node (int key, int val) {
        this.key = key;
        this.val = val;
    }
}