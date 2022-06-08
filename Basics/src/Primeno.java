
public class Primeno {

	public static void main(String[] args) {
		int input=10;
		boolean no=true;
		for(int i=2;i<=input;i++) {
			for(int j=2;j<=input;j++) {
				if(i!=j) {
					if(i%2==0) {
						no=false;
						break;
					}
				}else {
					System.out.println("the prime no is"+i);
				}
			}
		}

	}

}
