package assignments;

class ArmstrongNumBetweenRange{
    public void armstrongNumbersInRange(int min , int max){
    	for(int i=min;i<=max;i++)
    	{
    		int originalNumber=i;
    		int result=0;
    		int remainder;
    		 while (originalNumber != 0)
    	        {
    	            remainder = originalNumber % 10;
    	            result += Math.pow(remainder, 3);
    	            originalNumber /= 10;
    	        }
    		 if(result==i)
    		 {
    			 System.out.println(i);
    		 }
    		
    	}
	
    }
}

public class AssignmentQ2 {

	public static void main(String[] args) {
		ArmstrongNumBetweenRange arr =new ArmstrongNumBetweenRange();
		arr.armstrongNumbersInRange(100, 999);

	}

}
