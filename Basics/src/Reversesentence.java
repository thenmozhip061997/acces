
public class Reversesentence {

	public static void main(String[] args) {
		String sentence="sunday selenium class is going now";
		String splitword[]=sentence.split(" ");
		String out="";
		for(int i=0;i<splitword.length;i++) {
			char[] word=splitword[i].toCharArray();
			String rev="";
			for(int j=word.length-1;j>=0;j--) {
				rev=rev+word[j];
			}
			out=out+rev+" ";
		}System.out.println(out);

	}

}
