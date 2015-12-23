
public class Consonants {

	public static int countConsonants(String str) {
		int count = 0;
		String consonants = "bcdfghjklmnpqrstvwxz";
		consonants += consonants.toUpperCase();
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s = "";
			if (consonants.contains(s + str.charAt(i)))
				count++;
		}

		return count;
	}

	
}
