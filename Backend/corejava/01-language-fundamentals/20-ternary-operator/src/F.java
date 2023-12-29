class F 
{
	public static void main(String[] args) 
	{
		int firstNum = 10;
		int secondNum = 5;
		int thirdNum = 30;
		if(firstNum <  secondNum  &&  firstNum < thirdNum)
		{
		System.out.println("Among firstNum and secondNum and thirdNum:" + firstNum + "is minimum");
		}
		 else if (secondNum < thirdNum)
		{
		System.out.println("Among firstNum and secondNum and thirdNum:" + secondNum + "is minimum");
		}
		else
		{
		System.out.println("Among firstNum and secondNum and thirdNum:" + thirdNum + "is minimum");
		}
	}
}
