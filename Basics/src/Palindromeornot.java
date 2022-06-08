
public class Palindromeornot {

	public static void main(String[] args) {
		String word = "wow";
		String rev = "";
		char[] letter = word.toCharArray();
		for (int i = letter.length - 1; i >= 0; i--) {
			rev = rev + letter[i];
		}
		if (word.equals(rev)) {
			System.out.println("word is palindrome");
		} else {
			System.out.println("word is not a palindrome");
		}

	}

}
