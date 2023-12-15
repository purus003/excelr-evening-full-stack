class M 
{
	public static void main(String[] args) 
	{
		int i,j;
		for( i=0, j=20;
		(i<5 ||j>11);
		i++,j--)
	{
		System.out.println(i + ":" + j);
	}
	System.out.println(i + ":" + j);
	}
}
/*
i = 0,1,2,3,4,5
j = 20,19,18,17,16,15

0:20
1:19
2:18
3:17
4:16
5:15
6:14
7:13
8:12
9:11





*/