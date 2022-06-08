
public class Printchararray {

	public static void main(String[] args) {
		String name="thenmozhi";
		String rev="";
		char [] letter=name.toCharArray();
		for(int i=letter.length-1;i>=0;i--) {
			rev=rev+letter[i];
		}System.out.println(rev);

	}

}
