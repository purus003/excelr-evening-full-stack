class M13 
{
	public static void main(String[] args) 
	{
		Ancestor ancestor = new GrandFather();
		GrandFather grandFather =(GrandFather) ancestor;//explicity down casting from supertype to subtype
		System.out.println("done");
	}
}