package assignmentstringclass;
public class AssignmentStringClass {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println("The length of the string is: "+str.length());
		
		String str1 = "Hello";
		String str2 = "How are you?";
		System.out.println("The new string is :"+str1.concat(" "+str2));
		
		String str3 = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("Lowercase: "+str3.toLowerCase());
		System.out.println("UpperCase :"+str3.toUpperCase());
		System.out.println("Replace all a :"+str3.replace('a', '$'));
		System.out.println("Check contain :"+str3.contains("collection"));
		String str4 = "java string pool refers to collection of strings which are stored in heap memory";
		System.out.println("Matches the original :"+str4.equals(str3));
		System.out.println("If not equal other method :"+str4.equalsIgnoreCase(str3));
		
		//String buffer
		StringBuffer buff = new StringBuffer("StringBuffer ");
		buff.append("is a peer class of String ");
		buff.append("that provides much of ");
		buff.append("the functionality of strings");
		System.out.println("Append String : "+ buff);
		
		//insert the string text
		StringBuffer s = new StringBuffer("It is used to _ at the specified index position ");
		s.replace(13, 15, " insert text");
		System.out.println("New inserted string is: "+s);
		
		//Reverse the string
		StringBuffer s1 = new StringBuffer("This method returns the reversed object on which it was called");
		s1.reverse();
		System.out.println("Reverse STring: "+s1);
		
		System.out.println("------------String Builder--------------------");
		
		//StringBuilder
		StringBuilder sb = new StringBuilder("StringBuilder ");
		sb.append("is a peer class of String ");
		sb.append("that provides much of ");
		sb.append("the functionality of strings.");
		System.out.println("Append String : "+ sb);
		
		StringBuilder s2 = new StringBuilder("It is used to _ at the specified index position ");
		s2.replace(13, 15, " insert text");
		System.out.println("New inserted string is: "+s2);
		
		StringBuilder s3 = new StringBuilder("This method returns the reversed object on which it was called");
		s3.reverse();
		System.out.println("Reverse STring: "+s3);
		
		
	}

}
