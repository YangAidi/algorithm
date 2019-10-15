import java.util.HashMap;
import java.util.Map;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-10-14 17:53
 **/
class Trie {

    static class Tree {
        Map<Character, Tree> map = new HashMap<>();
        Map<Character, Boolean> b = new HashMap<>();

    }

    private Tree root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new Tree();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Tree tree = this.root;
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            if (i == word.length() - 1) {
                tree.b.put(c, true);
            }
            if (!tree.map.containsKey(c)) {
                Tree t = new Tree();
                tree.map.put(c, t);
                tree = t;
            } else {
                tree = tree.map.get(c);
            }
        }
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Tree tree = this.root;
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            if (i == word.length() - 1 && tree.b.containsKey(c)) {
                return true;
            }
            if (!tree.map.containsKey(c)) {
                return false;
            } else {
                tree = tree.map.get(c);
            }
        }
        return false;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        Tree tree = this.root;
        for (int i = 0; i < prefix.length(); ++i) {
            char c = prefix.charAt(i);
            if (!tree.map.containsKey(c)) {
                return false;
            } else {
                tree = tree.map.get(c);
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
