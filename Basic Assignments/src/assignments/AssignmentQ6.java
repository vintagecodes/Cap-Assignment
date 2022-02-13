package assignments;

import java.util.ArrayList;
class Manager extends AssignmentQ6{
	public int getSalary(int salary) {
		int incentive = 5000;
		int total = salary + incentive;
		return total;
	}
}

class Labour extends AssignmentQ6{
	public int getSalary(int salary) {
		int overtime = 500;
		int total = salary + overtime;
		return total;
	}
}
public class AssignmentQ6 {
	static int salary = 10000;
	public int getSalary(int salary) {
		return salary;
	}
	public int totalEmployeesSalary(ArrayList<Integer>employeeSalaries) {
		int sum =0 ;
		for(int i=0; i<employeeSalaries.size();i++) {
			sum = sum + employeeSalaries.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		Manager m = new Manager();
		Labour l = new Labour();
		AssignmentQ6 s = new AssignmentQ6();
		int x = m.getSalary(salary);
		int y = l.getSalary(salary);
		ArrayList<Integer> employeeSalaries = new ArrayList<Integer>();
		employeeSalaries.add(x);
		employeeSalaries.add(y);
		System.out.println("Total Salary of employees in an organization is : "+ s.totalEmployeesSalary(employeeSalaries));
	}

}
