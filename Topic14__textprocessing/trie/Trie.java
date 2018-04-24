package topic14_textprocessing.trie;

public class Trie {
	private TrieNode root;
	int size;

	public Trie() {
		root = new TrieNode('\0');
		size = 0;
	}

	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	private static boolean removeWord(TrieNode node, String word) {
		if (word.length() == 0) {
			if (!node.isWord) {
				return false;
			}
			node.isWord = false;
			return true;
		}
		char firstChar = word.charAt(0);
		TrieNode child = node.children.get(firstChar);
		if (child == null) {
			return false;
		}
		boolean output = removeWord(child, word.substring(1));
		if (!child.isWord && child.children.size() == 0) {
			node.children.remove(firstChar);
		}
		return output;
	}

	public void removeWord(String word) {
		if (removeWord(root, word))
			size--;
	}

	private static boolean addWord(TrieNode node, String word) {
		if (word.length() == 0) {
			if (node.isWord) {
				return false;
			}
			node.isWord = true;
			return true;
		}

		char firstChar = word.charAt(0);
		TrieNode child = node.children.get(firstChar);
		if (child == null) {
			child = new TrieNode(firstChar);
			node.children.put(firstChar, child);
		}
		return addWord(child, word.substring(1));
	}

	public void addWord(String word) {
		if (addWord(root, word))
			size++;
	}

	private static boolean containsWord(TrieNode node , String word) {
		if (word.length() == 0) {
			if (node.isWord) {
				return true;
			} else {
				return false;
			}
		}
		char firstChar = word.charAt(0);
		if (!node.children.containsKey(firstChar)) {
			return false;
		}
		return containsWord(node.children.get(firstChar), word.substring(1));
	}
	
	public boolean containsWord(String word) {
		return containsWord(root, word);
	}
}
