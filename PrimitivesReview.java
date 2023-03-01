package day06;

public class PrimitivesReview 
{
	public static void main(String[] args)
	{
		// Variable is  container that can hold piece of data
		// Data Declarartion Syntex -> DataType namOnVariable;
		
		// there are 8 core data type in Java
		// We call them primitives
		// Whole numbers: byte, short, int, long
		// What's the different between above primitives?
		// They can hold different range of values where bytes is the smallest
		// and long is the biggest.
		
		// float, double
		// They can hold decimal point numbers
		
		// char
		// It is for single character
		// Every char has numeric value from ACII table
		
		// boolean
		// It can hold logical value (true or false)
		
		String name = "John";
		int age = 37;
		int value = 10;
		
		System.out.println(age + value); // 47
		// concatenation and plus expressions are evaluated from left to right !!!
		System.out.println("Total value: " + age + value); // Total value: 3710
		System.out.println(age + value + " Total value:"); // 47 Total value:
		
		// wholeNumber / wholeNumber = wholeNumber
		int i = 5;
		int i2 = 2;
		
		//                 5/2 = 2
		System.out.println(i/i2);
		
		double result = i /  i2;
		System.out.println(result); // result = 2.0
		
		result = (double)i / i2;
		System.out.println(result); // result = 2.5
		
		
		

		
	}

}
