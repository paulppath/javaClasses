package day06;

public class Student 
{
	public static final double PERCENTAGE = 8.0;
	public static void main(String[] args)
	{
		String name = "John";
		double grade = 2.0;
		
		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);
		
		grade = grade + (grade * PERCENTAGE)/100;
		
		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);
		
	}

}
