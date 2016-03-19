package week7_Monday;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Path;

public class EncodingFixer {

	private EncodingFixer() {
	}

	static void writeOutput(String str) {
		try {
			FileOutputStream fos = new FileOutputStream("fixed.txt");
			Writer out = new OutputStreamWriter(fos);
			out.write(str);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static String readInput(Path path) {
		StringBuffer buffer = new StringBuffer();
		try {
			FileInputStream fis = new FileInputStream(path.toString());
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			int ch;
			while ((ch = in.read()) > -1) {
				buffer.append((char) ch);
			}
			in.close();
			return buffer.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	static void fixEncoding(Path path) {
		String decode = readInput(path);
		String retValue = "";
		String convertValue2 = "";
		ByteBuffer convertedBytes = null;
		try {

			CharsetEncoder encoder2 = Charset.forName("Windows-1252").newEncoder();
			CharsetEncoder encoder3 = Charset.forName("UTF8").newEncoder();
			assert encoder2.canEncode(decode);
			assert encoder3.canEncode(decode);

			ByteBuffer conv1Bytes = encoder2.encode(CharBuffer.wrap(decode.toCharArray()));

			retValue = new String(conv1Bytes.array(), Charset.forName("Windows-1252"));

			convertedBytes = encoder3.encode(CharBuffer.wrap(retValue.toCharArray()));
			convertValue2 = new String(convertedBytes.array(), Charset.forName("UTF8"));
			writeOutput(convertValue2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
