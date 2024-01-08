abstract class CarDriver
{
	public void howToDriveCar()
	{
		System.out.println("I got a License , and know how to drieve");
	}
	abstract void technicalDetails();
}
class Car extends CarDriver
{
	void technicalDetails()
	{
		System.out.println(" Technical things ,Engine ,TPMS, AORVMS , HillHoldAssit, ADAS");
	}
	public static void main(String... args)
	{
		Car safari = new Car();
		safari.howToDriveCar();
		safari.technicalDetails();
		System.out.println("done");
	}

}