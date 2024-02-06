class N implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("-----------------------------");
	}
}
public class M17
{
	public static void main(String[] args)
	{
		N obj = new N();
		//several constructors are available
		//reference to the runnable, name to the thread
		Thread t1 = new Thread(obj, "my first thread");// it takes Argument one is runnable type and one string type.
		t1.start();
		System.out.println(t1.getName());
		t1.setName("first child");
		System.out.println(t1.getName());
	}
}
