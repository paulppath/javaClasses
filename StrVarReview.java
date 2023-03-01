package day05;

public class StrVarReview 
{
	public static void main(String[] args)
	{
		// Variable is a container that can hold piece of data.
		// We need to declare our variable then we can use it.
		
		String str = "apple";
		// String  -> data type
		// str     -> variable name
		// "apple" -> value that will be stored in the variable.
		
		System.out.println(str);
		
		str = "orange";
		System.out.println(str);
		
		String firstName = "John", lastName = "Doe";
		
		System.out.print(firstName);
		System.out.print(" ");
		System.out.println(lastName);
		
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
	}

}
