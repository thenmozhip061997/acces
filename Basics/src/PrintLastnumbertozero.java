
public class PrintLastnumbertozero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {0,0,9,8,7,0,10};
		int temp=0;
		for(int i=0;i<number.length;i++) {
			if(number[i]!=0) {
				number[temp++]=number[i];
				
			}
		}
		while(temp<number.length) {
			number[temp++]=0;
		}
		for(int a:number) {
			System.out.println(a+",");
		}
	}

}
