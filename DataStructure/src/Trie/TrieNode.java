package Trie;

import java.util.HashMap;
import java.util.LinkedList;

public class TrieNode {

	char data;
	HashMap<Character,TrieNode> children;
	boolean isEnd;
	public TrieNode(char ch) {
		super();
		this.data = ch;
		this.children = new HashMap<Character,TrieNode>();
		this.isEnd = false;
	}
	public HashMap<Character,TrieNode> getChildren() {
		return children;
	}
	public boolean isEnd() {
		return isEnd;
	}
	public void setEnd(boolean isEnd) {
		this.isEnd = isEnd;
	}
	public char getData() {
		return data;
	}
	
	
	
}
