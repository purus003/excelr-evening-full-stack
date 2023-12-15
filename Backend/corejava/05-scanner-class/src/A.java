import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a complete token or word or a charcter");
		Scanner sc = new Scanner(System.in);//input stream
		String token = sc.next();
		System.out.println("the token that you entered is:" + token);
		sc.close();
	}
}
