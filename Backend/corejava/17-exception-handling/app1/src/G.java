class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		main(args);//calling main method again and again until  stack meomory full and after stack meomory full stack error.
		System.out.println("main end");
	}
}// stack over flow error