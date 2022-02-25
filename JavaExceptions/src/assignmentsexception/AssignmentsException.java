package assignmentsexception;
public class AssignmentsException {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println("The result is: "+c);
		}
		catch(ArithmeticException e){
			System.out.println("The number cannot be divided by zero");
		}

	}

}
