package X;

class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();

    }

    public static void main(String[] args) {
        WordDictionary wd = new WordDictionary();
        wd.addWord("a");
        wd.addWord("a");
        System.out.println(wd.search(".a"));

    }

    public void addWord(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!cur.children.containsKey(c)) {
                cur.children.put(c, new TrieNode());
            }
            cur = cur.children.get(c);


        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        return dfs(0, root, word);
    }

    public boolean dfs(int index, TrieNode passed, String word) {
        TrieNode cur = passed;
        for (int i = index; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for (TrieNode child : cur.children.values()) {
                    if (child != null && dfs(i + 1, child, word)) {
                        return true;
                    }

                }
                return false;
            }

            if (cur.children.containsKey(c)) {
                cur = cur.children.get(c);
            } else return false;

        }
        return cur.isEnd;
    }
}

