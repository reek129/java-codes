package Trie;

import java.util.HashMap;

public class TrieDs {

	TrieNode root = new TrieNode((char) 0);

	public void insert(String word) {
		int length = word.length();
		TrieNode crawlingNode = root;

		for (int i = 0; i < length; i++) {
			HashMap<Character, TrieNode> child = crawlingNode.getChildren();
			char indexCharacter = word.charAt(i);

			if (child.containsKey(indexCharacter)) {
				crawlingNode = child.get(indexCharacter);
			} else {
				TrieNode temp = new TrieNode(indexCharacter);
				child.put(indexCharacter, temp);
				crawlingNode = temp;
			}
		}
		crawlingNode.setEnd(true);
	}

	public boolean search(String word) {
		TrieNode crawling = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			HashMap<Character, TrieNode> children = crawling.getChildren();

			if (children.containsKey(ch)) {
				crawling = children.get(ch);
			} else {
				return false;
			}
		}

		if (crawling.isEnd)
			return true;

		return false;

	}

	public boolean prefixSearch(String word) {
		TrieNode crawling = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			HashMap<Character, TrieNode> children = crawling.getChildren();

			if (children.containsKey(ch)) {
				crawling = children.get(ch);
			} else {
				return false;
			}
		}

		return true;

	}
}
