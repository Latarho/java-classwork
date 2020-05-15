package ap4272;

public class WordPair {
	String[] sa = new String[2];

	public WordPair(String f, String s) {
		sa[0] = f;
		sa[1] = s;
	}

	public String getFirst() {
		return sa[0];
	}

	public String getSecond() {
		return sa[1];
	}
}