package day05;

public class Phone 
{
	public static void main(String[] args)
	{
		String phone1, phone2;
		
		phone1 = "iphone";
		phone2 = phone1;
		System.out.println(phone1 + " " + phone2);
		
		if (phone1.equalsIgnoreCase(phone2))
		
			System.out.println("Both phone is the same phone.");
		 
		else 
			
			System.out.println("They are a different phone.");
		
	}

}
