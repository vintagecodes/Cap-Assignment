package assignments;
import java.util.Scanner;

class AssignmentQ1 {
	public boolean armstrongCheck(int num) {
		int sum = 0;
		String n = "" + num; 
		int st = n.length();
		for(int i=0; i<st; i++) {
			int digit = Integer.parseInt(n.charAt(i)+ "");
			sum = (int) (sum + Math.pow(digit,3));
		}
		return (sum == num);
	}

}
public class ArmstrongOrNot{
	public static void main(String args[]) {
		AssignmentQ1 tb = new AssignmentQ1();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		if(tb.armstrongCheck(num)==true) {
			System.out.println("It is Armstrong Number");
		}
		else
		{
			System.out.println("It is not Armstrong Number");
		}
	}
}
