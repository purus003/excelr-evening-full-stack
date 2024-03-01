
//External properties file
//importing all the members seperately
import java.sql.DriverManager;//class
import java.sql.SQLException;//class
import java.sql.Connection;//interface
import java.sql.Statement;//interface
import java.sql.ResultSet;//interface
import java.sql.ResultSetMetaData;//interface
import java.io.FileReader;
import java.io.IOException;
//to load file contents to properties object
import java.util.Properties;
class M4 
{
	//no need of keeping throws Exception bcz of keeping try and catch
	//if you did not keep throws Exception
	  // should keep try catch wherever checked type of exception is there
	public static void main(String[] args) 
	{
		//Properties object
		Properties pr = new Properties();
		//through file reader we trying to connect to the properties file
		//we are loading file content to properties object
		//we dont need to close fin explicitely it auto closes
		try(FileReader fin = new FileReader("db.properties"))
		{
			pr.load(fin);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		String driver = pr.getProperty("driverClassName");
		String url = pr.getProperty("url");
		String un = pr.getProperty("username");
		String pw = pr.getProperty("password");
		//1. Registering driver
		try
		{
			Class.forName(driver);
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		String sql = "SELECT * FROM PERSON";
		//all these three Connection, Statement, ResultSet are closeable and extends Autocloseable interface
		//in this case we dont require to close the resources explicitely
		//every resource automaticaly closes
		//instead of using lenghty finally block we use this to autoclose 
		// immediately after execution of try automaticaly resources will be closed.
		try(Connection con = DriverManager.getConnection(url, un, pw);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) //JDK 1.7
		{
			//requires SQL Exception
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			for (int i = 1; i <= cols; i++)
			{
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			System.out.println("--------------------");
			while(rs.next())
			{
				for (int i = 1; i <= cols; i++)
				{
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
/*
- We might have to change the driver class for that we need to modify
the code.
-we might have to change IP address, XE or port number.
-we might have to chage username and password
- its not advisable to hardcode instead we get that 
info from the properties file.
-------------------
- properties file should be kept under classes where we trigger
java command.
- in the properties file property_field_name=value
- should not be having any unncessary spaces
- extension should be .properties
driverClassName=oracle.jdbc.driver.OracleDriver
url=jdbc:oracle:thin:@localhost:1521:XE
username=system
password=admin







public class DriverManager
extends Object
The basic service for managing a set of JDBC drivers.
*/
/*
public class SQLException
extends Exception
implements Iterable<Throwable>
An exception that provides information on a database access error or other errors.
*/
/*
public interface Connection
extends Wrapper, AutoCloseable
A connection (session) with a specific database. SQL statements are executed and results are returned within the context of a connection.

A Connection object's database is able to provide information describing its tables, its supported SQL grammar, its stored procedures, the capabilities of this connection, and so on. This information is obtained with the getMetaData method.
*/
/*
public interface Statement
extends Wrapper, AutoCloseable
The object used for executing a static SQL statement and returning the results it produces.

By default, only one ResultSet object per Statement object can be open at the same time. Therefore, if the reading of one ResultSet object is interleaved with the reading of another, each must have been generated by different Statement objects. All execution methods in the Statement interface implicitly close a statment's current ResultSet object if an open one exists.
*/
/*
What are checked exceptions?
Checked exceptions are checked at compile-time.
It means if a method is throwing a checked exception 
then it should handle the exception using try-catch block or
it should declare the exception using throws keyword, 
otherwise the program will give a compilation error.

Generally, checked exceptions denote error scenarios which 
are outside the immediate control of the program. ... 
Checked exceptions are subclasses of Exception class. 
Example of checked exceptions are : ClassNotFoundException, 
IOException, SQLException and so on.
*/

/*
The printStackTrace() method in Java is a tool used to 
handle exceptions and errors. It is a method of Java's 
throwable class which prints the throwable along with other 
details like the line number and class name where the exception 
occurred.
*/
