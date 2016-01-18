import java.util.Random;

public class Test
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				System.out.print(rand.nextInt(50) + " ");
			}
			System.out.println();
		}
	}
}