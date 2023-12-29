class I // nested if blocks means if block inside other if block
// if outer will return false it will not go inside the block
{
	public static void main(String[] args) 
	{
		if (false)
		{
			System.out.println("outer-if-begin");
		 if (true)
		{
			 if (true)
			 {
				 System.out.println("inner -most-if");
			 }
		}
	}
	System.out.println("outer-if -end");
	}
}
}