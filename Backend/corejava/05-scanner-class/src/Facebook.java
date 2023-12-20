import java.util.Scanner;
class Facebook
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Facebook! Please Register");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first Name");
		String firstName = sc.next();
		System.out.println("Enter your sur Name");
		String surName = sc.next();
		System.out.println("Enter your Mobile Number");
		long mobileNumber = sc.nextLong();
		System.out.println("Enter your Email ID");
		String emailid = sc.next();
		System.out.println("Enter your New password");
        String newPassword = sc.next();
		System.out.println("Enter your your DOB");
		String dateofBirth = sc.next();
		System.out.println("Enter your New Gender");
		String gender = sc.next();
		System.out.println("Enter your salary");
		double salary = sc.nextDouble();
		System.out.println("Enter your First intials");
		String firstIntials = sc.next();
		System.out.println("Enter your Favorite quote");
		sc.nextLine();
		String qoute = sc.nextLine();
		System.out.println("Are you Alive?");
	    boolean status = sc.nextBoolean();	
		System.out.println("\n________________\nYour details are listed \n" + 
		    "firstname :" + firstName + "\n" +
			"Sur name :" + surName + "\n" +
			"MobileNUmber :" + mobileNumber + "\n" +
			"Emailid:" + emailid + "\n" +
			"Password :" + newPassword + "\n" +
			"Date of birth :" + dateofBirth + "\n" +
			"Salary:" + salary + "\n" +
			"First Intial :" +firstIntials + "\n" +
			"Quote:" + qoute + "\n" +
			"Are you Alive?:" + status);
			sc.close();
	}
}
