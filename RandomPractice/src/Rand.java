import java.util.ArrayList;
import java.util.Random;

public class Rand
{
	private static ArrayList<Integer> list;
	private static long startTime;
	private static long endTime;
	private static Random rand;
	
	static
	{
		list = new ArrayList<>();
		startTime = 0;
		endTime = 0;
		rand = new Random();
	}
	
	public static void main(String[] args)
	{
		initArray();
		timeStart();
		for (int i = 0; i < 1000000; i++)
		{
			int index = rand.nextInt(1000);
			list.set(index, list.get(index)+1);
		}
		timeEnd();
		System.out.println(endTime-startTime);
		for (int i = 0; i < 1000; i++)
		{
			System.out.print(list.get(i) + " ");
		}
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
