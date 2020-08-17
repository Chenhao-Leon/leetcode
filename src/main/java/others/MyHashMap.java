package others;

/**
 * @author chenhao96
 * @description
 * @date 2020/8/17
 */
public class MyHashMap<K, V> {
    private static int default_length = 16;
    private MyEntry<K, V>[] entries;

    public MyHashMap() {
        super();
        entries = new MyEntry[default_length];
    }

    public V put(K key, V value) {
        int index = key.hashCode() % default_length;// hascode值除map大小取余
        MyEntry<K, V> prevoius = entries[index];
        for (MyEntry<K, V> entry = entries[index]; entry != null; entry = entry.next) {
            if (entry.getKey().equals(key)) {
                V oldValue = (V) entry.getValue();
                entry.setValue(value);
                return oldValue;
            }
        }
        MyEntry<K, V> entry = new MyEntry<>(key, value);
        entry.next = prevoius;
        entries[index] = entry;
        return null;
    }

    public K get(K key) {
        int index = key.hashCode() % default_length;
        for (MyEntry<K, V> entry = entries[index]; entry != null; entry = entry.next) {
            if (entry.getKey().equals(key)) {
                return (K) entry.getValue();
            }
        }
        return null;
    }

    private final class MyEntry<K, V> {
        private K key;
        private V value;
        private MyEntry next;

        public MyEntry() {
            super();
        }

        public MyEntry(K key, V value) {
            super();
            this.key = key;
            this.value = value;
        }

        public MyEntry(K key, V value, MyEntry next) {
            super();
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public MyEntry getNext() {
            return next;
        }

        public void setNext(MyEntry next) {
            this.next = next;
        }
    }
}
