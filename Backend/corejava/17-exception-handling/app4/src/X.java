import java.text.SimpleDateFormat;
class X 
{
	public static void main(String[] args) 
	{
		SimpleDateFormat df = null;
		df.parse("");
	}
}
/*
 unreported exception ParseException; must be caught or declared to be thrown
                df.parse("");*/