import java.util.Vector;


public class uniqueWords {
		
	
		public static int uniqueWordsCount (String [] arr)
		{
			Vector<String> words = new Vector<String>();
			
			for (int i = 0; i < arr.length; i++)
			{
				if (!words.contains(arr[i])) words.addElement(arr[i]);
			}
			
			
			return words.size();
		}
}
