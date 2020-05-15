
package ap4272;

import java.util.ArrayList;

public class WordPairList extends ArrayList<WordPair> {
	static final long serialVersionUID = 0;

	public WordPairList(String[] words) {
		for (int i = 0; i < words.length; ++i)
			for (int j = i; j < words.length; ++j)
				super.add(new WordPair(words[i], words[j]));
	}

	public int numMatches() {
		int c = 0;
		for (int i = 0; i < super.size(); ++i) {
			WordPair wp = super.get(i);
			if (wp.getFirst().equals(wp.getSecond()))
				++c;
		}
		return c;
	}
}