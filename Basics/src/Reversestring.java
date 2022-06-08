
public class Reversestring {

	public static void main(String[] args) {
		String sentence="Welcome to Selenium";
         sentence=sentence.toLowerCase();
         String []input=sentence.split(" ");
         String rev="";
         String out="";
         for(int i=0;i<input.length;i++) {
        	 if(i==input.length-1) {
        		 char[] letter=input[i].toCharArray();
        		 for(int j=letter.length-1;j>=0;j--) {
        		 rev=rev+letter[j];
        		 }
        		 out=out+rev;
        	 }else {
        		 out=out+input[i];
        	 }
        	 
         }
         System.out.println(out);
	}

}
