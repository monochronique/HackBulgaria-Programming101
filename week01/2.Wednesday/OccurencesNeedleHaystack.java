
public class OccurencesNeedleHaystack {

	public static int countOcurrences(String needle, String haystack) {
		int count = 0;
		int needleCounter;
		for (int i = 0; i < haystack.length(); i++) {
			needleCounter = 0;
			while (needleCounter < needle.length() && i < haystack.length()
					&& needle.charAt(needleCounter) == haystack.charAt(i)) {
				i++;
				needleCounter++;
			}
			if (needleCounter > 0)
				i--;
			if (needleCounter == needle.length())
				count++;

		}

		return count;
	}

}
