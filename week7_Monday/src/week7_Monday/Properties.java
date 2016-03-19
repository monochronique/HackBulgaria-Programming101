package week7_Monday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Properties {

	private Properties() {
	}

	public static Map<String, String> parseProperties(File propertiesFile) throws IOException {
		String line = "";
		String key = "", value = "";
		Map<String, String> map = new HashMap<>();
		BufferedReader buf = null;
		try {
			buf = new BufferedReader(new FileReader(propertiesFile));
			while ((line = buf.readLine()) != null) {
				if (!line.startsWith("#")) {
					key = line.substring(0, line.indexOf('='));
					value = line.substring(line.indexOf('=') + 1);
					map.put(key.trim(), value.trim());
				}
			}

		} finally {
			buf.close();
		}

		return map;

	}

}
