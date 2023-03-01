package day05;

public class ArithmeticOperaors 
{
	public static void main(String[] args)
	{ 
		// we can use arithmetic operators with numeric data types
		// byte, short, int, long
		// float, double
		
		// +, -, *, /
		// %
		
		int numberOne = 7;
		int numberTwo = 2;
		
		int result = numberOne + numberTwo;
		System.out.println("numberOne is " + numberOne);
		System.out.println("numberTwo is " + numberTwo);
		System.out.println("numberOne + numberTwo = " + result);
		
		result = numberOne - numberTwo;
		System.out.println("numberOne - numberTwo = " + result);
		
		result = numberOne * numberTwo;
		System.out.println("numberOne * numberTwo = " + result);
		
		result = numberOne / numberTwo;
		System.out.println("numberOne / numberTwo = " + result);
		
		double dResult;
		dResult = (double)numberOne / (double)numberTwo;
		System.out.println("numberOne / numberTwo = " + dResult);
		
	}

}
