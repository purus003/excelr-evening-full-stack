interface Resizable
{
	void resizeWidth(int width);
	void resizeHeight(int height);
}
class Rectangle implements Resizable
{

	private int width;
	private int height;

	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	public void resizeWidth(int width)
	{
		this.width = width;
	}
	public void resizeHeight(int height)
	{
		this.height = height;
	}
	public void printSize(){
		System.out.println("rectangle: width" + width + "height"+ height);
	}
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(5, 10);

		System.out.println("intial size");
		r1.printSize();
		r1.resizeWidth(10);
		r1.resizeHeight(20);
		System.out.println("After size");
		r1.printSize();

	   
	}
}
