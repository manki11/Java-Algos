package topic14_textprocessing.trie;

import java.util.HashMap;

public class TrieNode {

	char data;
	HashMap<Character,TrieNode> children;
	boolean isWord;
	public TrieNode(char data){
		this.data = data;
		this.children = new HashMap<>();
		isWord = false;
	}
}
