class G1 
{
	static int counter;
	{
		counter++;
	}
	public static void main(String[] args) 
	{
		G1 obj1 = new G1();
		G1 obj2 = new G1();
		G1 obj3 = new G1();
		G1 obj4 = new G1();
		G1 obj5 = new G1();
		G1 obj6 = new G1();
		G1 obj7 = new G1();
		System.out.println("no.of objects counter is :" +  counter );
	}
}
