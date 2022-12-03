package X;

import java.util.HashMap;

public class TrieNode {
    boolean isEnd;
    HashMap<Character, TrieNode> children;
    public TrieNode(){
        isEnd = false;
        children = new HashMap<>();
    }
}
