package week7_Monday;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FileUtilsTester {

	private static File file;

	@BeforeClass
	public static void initFile() {
		file = new File("test.txt");
	}

	@AfterClass
	public static void destroyFile() {
		file = null;
	}

	@Test
	public void testReadFrom() throws IOException {
		String expected = "adasdasd a";
		assertEquals(expected, FileUtils.readFrom(file));
	}

}
