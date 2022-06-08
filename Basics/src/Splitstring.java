
public class Splitstring {

	public static void main(String[] args) {
		String word="Rangith12(m654R2)";
		char []input=word.toCharArray();
		String out="";
		for(int i=0;i<input.length;i++) {
			if(input[i]=='(' || input[i]==')') {
				System.out.println(out);
				out="";
			}else {
				out=out+input[i];
			}
		}

	}

}
