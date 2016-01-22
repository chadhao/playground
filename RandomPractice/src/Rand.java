import java.util.ArrayList;

public class Rand
{
	private static ArrayList<Integer> list;
	private static long startTime;
	private static long endTime;
	
	static
	{
		list = new ArrayList<>();
		startTime = 0;
		endTime = 0;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	private static void timeStart()
	{
		startTime = System.currentTimeMillis();
	}
	
	private static void timeEnd()
	{
		endTime = System.currentTimeMillis();
	}
	
	private static void initArray()
	{
		for (int i = 0; i < 1000; i++)
		{
			list.add(0);
		}
	}

}
