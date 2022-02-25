package assignmentsexception;

import java.util.Scanner;
class IncorrectFileNameException extends Exception { 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectFileNameException(String errorMessage) {
        super(errorMessage);
    }
}

public class q3{
	static void fun() throws IllegalAccessException ,IncorrectFileNameException
{  
   
    double balance = 0, damount, wamount;

    Scanner dep = new Scanner(System.in);
		System.out.println("Deposit an amount");
		damount=dep.nextInt();
		balance += damount;
		System.out.println("Balance after depositing is: "+balance);

    Scanner wd = new Scanner(System.in);
		System.out.println("Withdraw an amount");
		wamount=wd.nextInt();

  
    if (wamount>balance)
    {
    throw new IllegalAccessException(); 
    }
    else if(wamount<0) {
    	throw new IncorrectFileNameException("IIlegal banking"); 
}
    else
    balance -= wamount;
	System.out.println("Balance after withdrawing is: "+balance);
}



public static void main(String args[]) 
{ 

    try
    { 
        fun(); 
    } 
    catch(IllegalAccessException ex) 
    { 
        System.out.println("Exceeding Balance"); 
         
    } 
    catch(IncorrectFileNameException e) 
    { 
        System.out.println(e.getMessage()); 
         
    } 
} 
}
