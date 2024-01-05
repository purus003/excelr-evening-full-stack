class M5 
{
	public static void main(String[] args) 
	{
		// if you are supplying type to the super type then auto-upcasting will happen
		// type promotion
		//super class refernce can hold sub class object
		A a1 = new B();// a1 = (A) new B();--> auto -upcasting
		B b1 = new C();
		C c1 = new D();
		System.out.println("done");
	}
}
