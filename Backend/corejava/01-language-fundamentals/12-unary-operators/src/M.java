class M
{
	public static void main(String[] args) 
	{ 
		int i = 0;
		// 
		int j = ++i + ++i + ++i + i;//1+2+3+3
		System.out.println(i);//3
		System.out.println(j);//9
	}
}
// i = 0,1,2,3 