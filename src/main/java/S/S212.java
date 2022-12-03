package S;

import java.util.*;

public class S212 {
    private static int COLS;
    private static int ROWS;

    private Trie2 currentTrie;
    public static List<String> findWords(char[][] board, String[] words) {
    Trie2 wordTree = new Trie2();
    for (String word : words){
        wordTree.addWord(word);
    }
    COLS = board.length;
    ROWS = board[0].length;
    HashSet<String> res = new HashSet<>();
    HashSet<String> visit = new HashSet<>();
        for (int c = 0; c < COLS; c++) {
            for (int r = 0; r < ROWS; r++) {

                    dfs(r, c, wordTree, "", res, visit, board, wordTree);

            }
        }
        return new ArrayList<>(res);
    }
    public static void dfs(
            int c,
            int r,

            Trie2 node,
            String word,

            HashSet<String> res,
            HashSet<String> visit,
            char[][]board,
            Trie2 root
    ){
    if (c<0||r<0||c==COLS||r==ROWS||!node.children.containsKey(board[r][c])||node.children.get(board[r][c]).refs<1||visit.contains(r+"-"+c)){
    return;
    }
    visit.add(r+"-"+c);
    node = node.children.get(board[r][c]);
    word+=board[r][c];
    if (node.isWord){
        node.isWord = false;
        res.add(word);
        root.removeWord(word);

    }
        dfs(r + 1, c, node, word, res, visit, board, root);
        dfs(r - 1, c, node, word, res, visit, board, root);
        dfs(r, c + 1, node, word, res, visit, board, root);
        dfs(r, c - 1, node, word, res, visit, board, root);
        visit.remove(r + "-" + c);
    }



}
class Trie2 {

    public HashMap<Character, Trie2> children;
    public boolean isWord;
    public int refs = 0;
    private Trie2 currentTrie;

    public Trie2() {
        children = new HashMap<>();
    }

    public void addWord(String word) {
        currentTrie = this;
        currentTrie.refs += 1;
        for (int i = 0; i < word.length(); i++) {
            char currentCharacter = word.charAt(i);
            if (!currentTrie.children.containsKey(currentCharacter)) {
                currentTrie.children.put(currentCharacter, new Trie2());
            }
            currentTrie = currentTrie.children.get(currentCharacter);
            currentTrie.refs += 1;
        }
        currentTrie.isWord = true;
    }

    public void removeWord(String word) {
        currentTrie = this;
        currentTrie.refs -= 1;
        for (int i = 0; i < word.length(); i++) {
            char currentCharacter = word.charAt(i);
            if (currentTrie.children.containsKey(currentCharacter)) {
                currentTrie = currentTrie.children.get(currentCharacter);
                currentTrie.refs -= 1;
            }
        }
    }
}


