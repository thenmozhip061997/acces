
public class Secondlargestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {9,4,6,1,7,10};
		int temp;
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]<number[j]) {
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
			for(int a:number) {
				System.out.print(a+" , ");
			}
		

	}}
