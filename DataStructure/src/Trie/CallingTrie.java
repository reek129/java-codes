package Trie;

public class CallingTrie {

	public static void main(String[] args) {

		TrieDs t= new TrieDs();
		t.insert("reek");
		t.insert("rahul");
		t.insert("rambo");
		
		System.out.println(t.search("rambo"));
		System.out.println(t.prefixSearch("r"));
	}

}
