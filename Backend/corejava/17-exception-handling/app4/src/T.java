import java.sql.DriverManager;
class T 
{
	public static void main(String[] args) 
	{
		DriverManager.getConnection("");
	}
}
/*unreported exception SQLException; must be caught or declared to be thrown
                DriverManager.getConnection("");*/