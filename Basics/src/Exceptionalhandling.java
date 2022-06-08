
public class Exceptionalhandling {

	public static void main(String[] args) {
		try {
			int i=1/0;
			System.out.print("try");
		}catch(Exception e) {
			System.out.print("something went "+e);
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}

	}

}
