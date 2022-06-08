
public class Reverseword {

	public static void main(String[] args) {
		String input="hi";
		char[] letter=input.toCharArray();
		String rev="";
		for(int i=letter.length-1;i>=0;i--) {
			rev=rev+letter[i];
			
		}System.out.println(rev);

	}

}
