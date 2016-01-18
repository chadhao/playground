
public class ThingsToDo implements Runnable
{
	private int leftOver;
	
	public ThingsToDo(int leftOver)
	{
		this.leftOver = leftOver;
	}
	
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			if ((i+1)%2 == leftOver)
			{
				System.out.println(i+1);
				Thread.yield();
				try{Thread.sleep(2000);}catch(Exception e){};
			}
		}
	}
}
