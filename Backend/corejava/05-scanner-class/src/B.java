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
		long mobileNumber = sc.nextlong();
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
		char firstIntials = sc.nextcharacter();
		System.out.println("Enter your Favorite quote");
		String qoute = sc.nextline();
		System.out.println("Your details are listed \n" + 
		    "firstname :" + firrstname + "\n"
			"Sur name :" + surname + "\n"
			"MobileNUmber :" + mobilenumber + "\n"
			"Emailid:" + emailid + "\n"
			"Password :" + password + "\n"
			"Date of birth :" + date of birth + "\n"
			"Salary:" + salary + "\n"
			"First Intial :" +first intial + "\n"
			"Quote:" + quote);




	}
}
