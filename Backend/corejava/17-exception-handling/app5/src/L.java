import java.sql.DriverManager;
import java.sql.SQLException;
class L
{
	public static void main(String[] args) throws SQLException
	{
		System.out.println("main begin");
		DriverManager.getConnection("");//sql type of exception
		Thread.sleep(1000);//interputted exception
		Class.forName("");//class not found exception
		System.out.println("main end");
	}
}
