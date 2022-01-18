package Lec44;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.insert("abba");
		t.insert("aba");
		t.insert("ac");
		t.insert("abbc");
		
		System.out.println(t.startsWith("aa"));
		System.out.println(t.countPrefix("a"));
		System.out.println(t.allWordsPrefix("ab"));
		

	}

}
