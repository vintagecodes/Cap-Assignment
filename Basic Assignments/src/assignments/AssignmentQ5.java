package assignments;

class TaxsAmount{
    public double calculate(int ctc)
    {
    	double tax = 0;
    	int forA=180000;
    	int forB=300000;
        int forC=500000;
        int forD =1000000;
    	if(ctc<forA) 
    	{
    		tax=0;
    	}
    	else if((ctc<forB)&&(ctc>forA))
    	{
    		tax=(ctc-forA)*0.1;
    	}
    	else if((ctc<forC)&&(ctc>forB))
    	{
    		tax=(ctc-forB)*0.2;
    		tax+=34000;
    	}
    	else if((ctc<forD)&&(ctc>forC))
    	{
    		tax=(ctc-forC)*0.3;
    		tax+=94000;
    	}
		return tax;
    }
}

public class AssignmentQ5 {

	public static void main(String[] args) {
		TaxsAmount tx=new TaxsAmount();
		double taxamount=tx.calculate(100000);
		System.out.print(taxamount);

	}

}
