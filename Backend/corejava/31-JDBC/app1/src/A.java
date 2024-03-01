import java.sql.*;
class A 
{
	public static void main(String[] args) throws Exception
	{
		String sql1 = "DROP TABLE IF EXISTS jdbc10";// create 
		String sql2 = "CREATE TABLE JDBC10(ID INTEGER)";
		Class.forName("com.mysql.cj.jdbc.Driver");//loading the driver class
		Connection con = DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/excelr", "president", "admin"); //creating connection  connection is interface statement is interface  
		Statement stmt = con.createStatement();//send our statements.
		stmt.execute(sql1);
		stmt.execute(sql2);
		System.out.println("done");
	}
}
/* first we ac*/