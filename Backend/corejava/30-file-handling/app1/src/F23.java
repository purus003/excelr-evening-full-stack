import java.io.File;

public class F23
{
	public static void main(String[] args)
	{
		File src = new File("C:\\FileHandling");
		File[] members = src.listFiles();
		int dirCount = 0, fileCount = 0;
		for(File member : members)
		{
			if(member.isFile())
			{
				fileCount ++;
			}

			else
			{
				dirCount ++;
			}
		}
		System.out.println("files count: " + fileCount) ;
		System.out.println("dir count: " + dirCount);	
	}
}
