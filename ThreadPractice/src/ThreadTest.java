
public class ThreadTest
{

	public static void main(String[] args)
	{
		ThingsToDo odd = new ThingsToDo(1);
		ThingsToDo even = new ThingsToDo(0);
		
		Thread oddThread = new Thread(odd);
		Thread evenThread = new Thread(even);
		
		oddThread.start();
		evenThread.start();
		
	}

}
