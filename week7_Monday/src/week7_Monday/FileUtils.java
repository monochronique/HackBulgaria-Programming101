package week7_Monday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class FileUtils {

	private static FileUtils instance;

	private FileUtils() {
	};

	public FileUtils getInstance() {
		if (instance == null) {
			instance = new FileUtils();
		}
		return instance;
	}

	public static String readFrom(File file) throws IOException {
		BufferedReader buf = null;
		StringBuilder builder = new StringBuilder();
		try {
			buf = new BufferedReader(new FileReader(file));

			String line = "";
			boolean addNewline = false;
			while ((line = buf.readLine()) != null) {
				if (addNewline) {
					builder.append(System.lineSeparator());
				} else {
					addNewline = true;
				}
				builder.append(line);

			}
		} finally {
			buf.close();
		}
		return builder.toString();

	}

	public String readFrom(Path path) throws IOException {
		return readFrom(path.toFile());
	}

	public void writeTo(String contents, File file) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write(contents);
		writer.close();
	}

}
