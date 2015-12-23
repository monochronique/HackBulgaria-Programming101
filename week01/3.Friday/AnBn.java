
public class AnBn {

	
	public static boolean is_an_bn (String word)
	{
		if (word.length() == 0) return true;
		return (word.matches("a*[a]b*[b]") && ((word.lastIndexOf('a') + 1) * 2) == word.length());
		
	}
	
}
