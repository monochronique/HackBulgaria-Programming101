
public class Vowels {

	public static int countVowels(String str) {
		int count = 0;
		String vowels = "aeiouyAEIOUY";
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s = "";
			if (vowels.contains(s + str.charAt(i)))
				count++;
		}

		return count;
	}

}
