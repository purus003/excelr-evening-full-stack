import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class F10
{
	public static void main(String[] args)  throws IOException
	{
		//creates a new file is not exists
		FileWriter out = new FileWriter("test6.txt", true);
		BufferedWriter bout = new BufferedWriter(out);
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		bout.write("test");
		bout.newLine();
		bout.write("test");
		bout.write("test");
		bout.flush();
		bout.close();
		out.close();
		System.out.println("done");
	}
}
