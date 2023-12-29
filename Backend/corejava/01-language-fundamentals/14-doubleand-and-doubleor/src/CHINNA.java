class CHINNA 
{
	public static void main(String[] args) 
	{
		int counter = 5;
        counter = counter++ + --counter - ++counter - counter--;
		System.out.println(counter);
	}
}
