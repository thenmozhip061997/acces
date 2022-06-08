
public class Fibbinociseries {

	public static void main(String[] args) {
		int out=0;
		int a=0,b=1;
		System.out.println(a+out+b);
		for(int i=2;i<=10;i++) {
			int c=a+b;
			System.out.print(out+c);
			a=b;
			b=c;
		}

	}

}
