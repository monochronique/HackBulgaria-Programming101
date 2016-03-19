package week7_Monday;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class WordCounterResultTester {
	
	
	private static File file;
	@BeforeClass
	public static void initFile ()
	{
		file = new File ("test.txt");
	}
	@AfterClass
	public static void destroyFile ()
	{
		file = null;
	}
	@Test
	public void testWordCountResult() throws IOException {
		WordCountResult result = WordCountResult.wordCount(file);
		assertEquals(result.getCharactersCount(), 10);
		assertEquals(result.getLinesCount(), 3);
		assertEquals(result.getWordsCount(), 4);
		
	}

}
