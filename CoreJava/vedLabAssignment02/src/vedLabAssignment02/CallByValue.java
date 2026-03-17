package vedLabAssignment02;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 2;
		int b=3;
		System.out.println("Before change a = "+a+" b = "+b);
		change(a,b);
		System.out.println("Ater change a = "+a+" b = "+b);

	}

	private static void change(int a, int b) {
		a=3;
		b=2;
		
	}

}
