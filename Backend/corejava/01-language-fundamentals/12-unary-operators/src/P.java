class P 
{
	public static void main(String[] args) 
	{
		int i = 20;
		int j = ++i + i++ + --i + i--;
		int k = ++j + ++i + j++;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
