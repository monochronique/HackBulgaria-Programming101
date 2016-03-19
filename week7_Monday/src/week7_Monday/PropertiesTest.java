package week7_Monday;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PropertiesTest {
	
	private static Map<String, String> map;
	private static File file;

	
	@BeforeClass
	public static void initFile() {
		file = new File("properties.txt");
		map = new HashMap<>();
		map.put("a1", "b1");
		map.put("a2", "b2");
		map.put("a3", "b3");
		map.put("a4", "b4");
		map.put("a5", "b6=b7=b8");
		map.put("a6", "b9 #comment");
		map.put("a7", "=b10");
	}

	@AfterClass
	public static void destroyFile() {
		file = null;

	}

	@Test
	public void testProperties() throws IOException {
		assertEquals(map, Properties.parseProperties(file));
	}

}
