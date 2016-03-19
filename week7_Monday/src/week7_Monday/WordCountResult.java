package week7_Monday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordCountResult {

	public int getWordsCount() {
		return wordsCount;
	}

	public int getLinesCount() {
		return linesCount;
	}

	public int getCharactersCount() {
		return charactersCount;
	}

	private WordCountResult(int wordsCount, int linesCount, int charactersCount) {
		super();
		this.wordsCount = wordsCount;
		this.linesCount = linesCount;
		this.charactersCount = charactersCount;
	}

	private int wordsCount = 0, linesCount = 0, charactersCount = 0;

	private static int wordsInLine(String line) {
		StringTokenizer  st = new StringTokenizer (line);
		return st.countTokens();
	}

	public static WordCountResult wordCount(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int lines = 0;
		int words = 0;
		int characters = 0;
		String line = "";
		while ((line = reader.readLine()) != null) {
			lines++;
			characters += line.length();
			words += wordsInLine(line);
		}
		reader.close();

		return new WordCountResult(words, lines, characters);

	}

}
