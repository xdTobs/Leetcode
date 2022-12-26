package X;

import java.util.HashMap;

class TrieNode {
    public boolean isEnd;
    public HashMap<Character, TrieNode> children;
    public TrieNode(){
        isEnd = false;
        children = new HashMap<>();
    }
}
