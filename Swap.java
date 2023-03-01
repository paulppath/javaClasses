package day05;

public class Swap 
{
	public static void main(String[] args)
	{
		String sky = "yellow";
		String sun = "bule";
		String swap;
		
		swap = sky;
		sky = sun;
		sun = swap;
		
		System.out.println("Sky is " + sky);
		System.out.println("Sun is " + sun);
		
	}

}
