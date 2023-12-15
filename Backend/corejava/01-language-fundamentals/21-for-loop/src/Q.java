class Q 
{
	public static void main(String[] args) 
	{
		int i;
		for (i = 0,System.out.println("INITIALIZER");
		i<5;
		i++, System.out.println("INCREMENT"))
		{
		System.out.println("BODY");
		}
	}
}
/*
i = 0,1,2,3,4,5

INITIALIZER// will excute only one time
BODY
INCREMENT
BODY
INCREMENT
BODY
INCREMENT
BODY
INCREMENT
BODY
INCREMENT


*/