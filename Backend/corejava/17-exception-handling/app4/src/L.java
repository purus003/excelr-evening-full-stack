class L
{
	public static void main(String[] args) 
	{
		int i = 10 / 0;//AE//arithmetic exception
		int j = Integer.parseInt("abc");//NFE//numberformatexception
		String s1 = null;
		int k = s1.length();//NPE //null pointer exception
		int[] l = new int[4];
		int m = l[4];//AIOBE // array index bound exception
		Object obj = new L();
		String s = (String)obj;//CCE// clash cash exception
		main(null);//SOE// stack over flow error
		int[] n = new int[99999999];//OME //out of meomory
		String s2 = "hello";
		String s3 = s2.substring(5, 10);//SIOBE//string index out bound exception
		int[] p = new int[-10];//NASE//negative array size exception
	}
}
