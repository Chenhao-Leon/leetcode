package leetcode_208;

/**
 * @Auther: Chen Hao
 * @Date: 2020/3/4
 * @Description: 实现 Trie (前缀树) 结合答案的重写
 */
class Trie {
    Trie[] triesArray = new Trie[26];
    boolean isEnd = false;
    public Trie() { }
    public void insert(String word) {
        Trie node = this;
        for(int i = 0; i < word.length(); i++){
            Trie[] array = node.triesArray;
            int index = word.charAt(i) - 'a';
            if(array[index] == null) {
                array[index] = new Trie();
            }
            node = array[index];
        }
        node.isEnd = true;
    }
    public boolean search(String word) {
        Trie node = this;
        for(int i = 0; i < word.length(); i++){
            Trie[] array = node.triesArray;
            int index = word.charAt(i) - 'a';
            if(array[index] != null){
                node = array[index];
            } else return false;
        }
        return node.isEnd;
    }
    public boolean startsWith(String prefix) {
        Trie node = this;
        for(int i = 0; i < prefix.length(); i++){
            Trie[] array = node.triesArray;
            int index = prefix.charAt(i) - 'a';
            if(array[index] != null){
                node = array[index];
            } else return false;
        }
        return node != null;
    }
}
