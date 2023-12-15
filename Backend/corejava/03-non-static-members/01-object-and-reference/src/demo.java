class Calculator 
{
	int a = 50;
	int b = 40;
	void add()
	{
		int c = a +b;
		System.out.println(c);
	}

}
 public class Demo
  {
	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();
		calc.add();
		
	}
}
