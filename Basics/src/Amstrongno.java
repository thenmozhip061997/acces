
public class Amstrongno {

	public static void main(String[] args) {
		int a=388;
		int temp=a;
		int r, sum=0;
		while(a>0) {
			r=a%10;
			a=a/10;
			sum=sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println("no is amstrong");
		}else {
			System.out.println("no is not amstrong");
		}
	}

}
