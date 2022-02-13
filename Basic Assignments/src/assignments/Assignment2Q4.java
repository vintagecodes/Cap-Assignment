package assignments;

import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3{
	int totalDeposits = 10000;
	int creditLimit = 2000;
	public int getCash() {
		return totalDeposits;
		
	}
}
class SavingsAccount extends Assignment2Q3{
	int totalDeposits = 10000;
	int fixedDepositsAmount = 5000;
	public int getCash() {
		int total = totalDeposits + fixedDepositsAmount;
		return total;
	}
}

public class Assignment2Q4 {
	public int totalCashInBank(ArrayList<Integer>cash) {
		int sum = 0;
		for(int i =0; i<cash.size();i++) {
			sum = sum + cash.get(i);
		}
		return sum;
	}
	
	public int getCash() {
		return 0;
		
	}

	public static void main(String[] args) {
		CurrentAccount cr = new CurrentAccount();
		SavingsAccount sa = new SavingsAccount();
		Assignment2Q4 as = new Assignment2Q4();
		int x = cr.getCash();
		int y = sa.getCash();
		ArrayList<Integer>cash = new ArrayList<Integer>();
		cash.add(x);
		cash.add(y);
		System.out.println("Total Cash in Bank : "+as.totalCashInBank(cash) );

	}

}
