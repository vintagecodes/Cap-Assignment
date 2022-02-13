package assignments;

class FindElement{
    public int searchForArray(int[] arr,int value)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]==value)
        		return i;
    		
    	}
    	return -1;
    }
}

public class AssignmentQ7 {

	public static void main(String[] args) {
		int arr[] = {8,9,15,22,33,45,68,25,65,98};
        int valueToCheck = 18;
        FindElement sc1=new FindElement();
        int index = sc1.searchForArray(arr, valueToCheck);
        if(index == -1) {
        	System.out.println("element is not present");
        }
        else {
        	System.out.println("Yes it is present");
        }

	}

}
