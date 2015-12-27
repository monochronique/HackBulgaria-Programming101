import java.util.HashMap;

public class WordOccurences {

	public static HashMap<String, Integer> words(String s) {
		s += " ";
		HashMap<String, Integer> map = new HashMap<>();
		String currentWord = "";
		int index = 0;
		while (index < s.length()) {
			currentWord = s.substring(index, s.indexOf(' ', index));
			index += currentWord.length() + 1;
			if (map.containsKey(currentWord)) {
				map.put(currentWord, map.get(currentWord) + 1);
			} else {
				map.put(currentWord, 1);
			}
		}

		return map;
	}

}
