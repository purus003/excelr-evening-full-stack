class V extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("run begin");
		Util.sleep(10000);
		System.out.println("run end");
		System.out.println("run end");
		System.out.println("run end");
		System.out.println("run end");
	}
}
public class M26
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		V obj = new V();
		Util.sleep(2000);
		obj.start();
		
		//sleeping thread can be interrupted
		//when the thread is in sleep if we call interrupt coming away from the sleep with the exception
		obj.interrupt();
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
		}
		System.out.println("main end");
	}
}
