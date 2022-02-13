package generics;

import java.util.Scanner;

public class AssignmentQ3 {
	public <E> E[] printExchangeElements(E[] list) {
		
		Scanner sc = new Scanner(System.in);
		
		for (E e : list) {
			
			System.out.println(e);
			
		}

		
		int len = list.length;
		
		System.out.println("Select two numbers from 0 to "+(len-1));
		
		int a= sc.nextInt();
		
		int b = sc.nextInt();
		
					
		E temp = list[a];
			
		list[a] = list[b];
			
		list[b] = temp;
		
		for (E e : list) {
			
			System.out.println(e);
			
		}
		return list;

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {1,2,3,4,5,6};
		String arr1[]= {"horn","peek","thor","devil"};
		AssignmentQ3 ass1=new AssignmentQ3();
		Integer a[]=ass1.printExchangeElements(arr);
		String a3[]=ass1.printExchangeElements(arr1);
		for (Integer a2:a)
		{
			System.out.println(a2);
		}
		for (String a2:a3)
		{
			System.out.println(a2);
		}

	}

}
