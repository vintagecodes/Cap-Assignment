package generics;

import java.util.HashSet;

public class AssignmentQ1<T> {
	
	private T id;
	private T name;
	private T dept;
	
	public AssignmentQ1(T id, T name, T dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public void display() {
		HashSet<T> as = new HashSet<>();
		as.add(id);
		as.add(name);
		as.add(dept);
		
		String[] details = as.toArray(new String[as.size()]);
		
		System.out.println("ID ->"+details[0]+" Name ->"+details[1]+" Department ->"+details[2]);
	}

	public static void main(String[] args) {
		
		AssignmentQ1<String> dis = new AssignmentQ1<String>("101","Ritik","Software");
		dis.display();
	}

}
