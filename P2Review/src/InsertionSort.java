import java.util.Random;

public class InsertionSort
{
	private static int[] a;
	
	static
	{
		a = new int[10];
	}
	
	public static void main(String[] args)
	{
		populate();
		
		System.out.println("Before sorting:");
		printArray();
		System.out.println("--------------------------------\n");
		
		for (int i = 1; i < a.length; i++)
		{
			System.out.println("Round " + i);
			int temp = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > temp)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
			printArray();
			System.out.println("--------------------------------\n");
		}
		
		System.out.println("After sorting:");
		printArray();
	}
	
	public static void populate()
	{
		Random random = new Random();
		for (int i = 0; i < a.length; i++)
		{
			a[i] = random.nextInt(100);
		}
	}
	
	public static void printArray()
	{
		for (int num : a)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}
 
}