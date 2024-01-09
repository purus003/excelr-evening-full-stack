public class G
{
	public static void main(String[] args)
	{
		int i = +10;
		String []x = new String[i];//size must be int type
		System.out.println(x.length);
		System.out.println("------");
		i = +0;
		String []y = new String[i];
		System.out.println(y.length);
		System.out.println("------");
		i = -2;// we cant able create arrays with negative 
		String []z = new String[i];
		System.out.println(z.length);
		System.out.println("------");
	}
}
