class Thar 
{
	private String Twodoor = "black";
	
	public String getTwodoor()
	{
		return Twodoor;
	}
	public void setTwodoor(String color)
	{
		Twodoor = color;
	
	}
}
class Schorpio
{
	public static void main(String[] agrs)
	{
		Thar t1 = new Thar();
		System.out.println(t1.getTwodoor());
		t1.setTwodoor("White");
		System.out.println(t1.getTwodoor());
	}
}