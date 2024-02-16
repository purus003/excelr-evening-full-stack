import java.util.ArrayList;
import java.util.Iterator;
class M37 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(40);
		list.add(80);
		list.add(50);
		list.add(60);
		list.add(90);
		list.add(70);
		System.out.println(list);
		System.out.println("-------");

		Iterator it = list.iterator();
		while (it.hasNext())
		{
			Object obj = it.next();
			if (obj.equals(80))
			{
				it.remove();
			}
		}
		System.out.println("final list"+ list);
	}
}
