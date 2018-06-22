package org.itstep;

import java.util.Scanner;

public class Model {
	private String word;
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Model(String word, int number) {
		super();
		this.word = word;
		this.number = number;
	}

	public Model() {
		super();
	}

	public String inputWordByScaner1(String word) {
		if (word.equals("Mariia")) { // Имя студента
			String correctWord = word;
			return correctWord;
		} else {
			return null;
		}
	}

	public int inputWordByScaner2(int number) {
		if (number == 3) {
			int correctNumber = number;
			return correctNumber;
		} else {
			return 0;
		}
	}

	public String writeSentence(String word1, int number) {
		return word1 + " " + number;
	}
}
