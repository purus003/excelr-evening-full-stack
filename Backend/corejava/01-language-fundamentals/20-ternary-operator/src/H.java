class  H
{
	public static void main(String[] args) 
	{
		int firstNum = 10;
		int secondNum = -5;
		int thirdNum = 15;
		int min  = (firstNum < secondNum ) &&(secondNum <thirdNum) ? firstNum : secondNum : thirdNum;
		System.out.println(min);
	}
}
