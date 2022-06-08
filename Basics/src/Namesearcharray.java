
public class Namesearcharray {

	public static void main(String[] args) {
		String names[]= {"thenmozhi","janani","soundhar","vijay","mahesh"};
		boolean isthenmozhipresent=false;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals("thenmozhi")) {
				isthenmozhipresent=true;
				break;
			}
		}
		if(isthenmozhipresent==true) {
			System.out.println("present");
		}
		else {
			System.out.println("absent");
		}
	}

}
