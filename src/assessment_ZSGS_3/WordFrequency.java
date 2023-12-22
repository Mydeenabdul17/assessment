package assessment_ZSGS_3;

import java.util.Scanner;

public class WordFrequency {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the text");
		String text = sc.nextLine();
		text=text.toLowerCase();
		System.out.println(new WordFrequency().frequency(text));
	}

	public String[] toArray(String text) {
		int size = 1;
		for (int i = 0; i < text.length(); i++) {
			if (!Character.isLetter(text.charAt(i))) {
				size++;
			}
		}
		String[] words = new String[size];
		String word = "";
		for (int i = 0, j = 0; i < text.length(); i++) {
			if (!Character.isLetter(text.charAt(i))) {
				words[j] = word;
				j++;
				word = "";
			}
			if (Character.isLetter(text.charAt(i))) {
				word += text.charAt(i);
			}
			if (i == text.length() - 1) {
				words[j] = word;
			}
		}
		return words;
	}

	public String frequency(String text) {
		String words[] = toArray(text);
		String[][] frequency = new String[numberOfUniqueWords(text)][2];
		String res = "";
		for (int i = 0, in = 0; i < words.length; i++) {
			int count = 1;
			if (!words[i].equals(" ")) {
				for (int j = i + 1; j < words.length; j++) {
					if (words[i].equals(words[j])) {
						count++;
						words[j] = " ";
					}
				}
				frequency[in][0] = words[i];
				frequency[in][1] = "" + count;
				in++;
			}
		}
		for (int i = 0; i < frequency.length; i++) {
			res += frequency[i][0] + "-" + frequency[i][1];
			if (i != frequency.length - 1) {
				res += " , ";
			}
		}
		return res;
	}

	public int numberOfUniqueWords(String text) {
		String[] words = toArray(text);
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i] != " ") {
				count++;
				for (int j = i + 1; j < words.length; j++) {
					if (words[j].equals(words[i])) {
						words[j] = " ";
					}
				}
			}
		}
		return count;
	}
}
