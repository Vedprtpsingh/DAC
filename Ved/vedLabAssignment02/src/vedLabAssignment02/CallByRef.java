package vedLabAssignment02;

public class CallByRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={10,20,30};
		System.out.print("array before change: ");
		PrintArray(num);
		change(num);
		System.out.print("array after change: ");
		PrintArray(num);

	}

	private static void change(int[] num) {
		// TODO Auto-generated method stub
		num[0]=100;
		
	}
	public static void PrintArray(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}

}
