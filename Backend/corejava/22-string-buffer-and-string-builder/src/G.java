class G 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------------------");
		sb.append("123456789112345B7");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		String str = sb.substring(15, 16);
	    for (int i = 0;i < sb.length(); i++ )
	    {
			if (i == 15)
			{
              System.out.println(sb.charAt(i));
			}
			
	    }
		sb.append("6");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("5");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
/*
 * capacity will be automatically increased
 * bcz of this StringBuffer is mutable.

 new capcity = old capacity * 2 + 2
 */
