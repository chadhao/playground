import java.util.Random;
import java.util.Scanner;

public class Draw
{
	private static int num_of_drawer;
	private static int num_of_options;
	private static Scanner keyboard;
	
	static
	{
		num_of_options = 0;
		num_of_drawer = 0;
		keyboard = new Scanner(System.in);
	}
	
	public static void main(String[] args)
	{
		System.out.print("How many people: ");
		num_of_drawer = keyboard.nextInt();
		
		People people = new People(num_of_drawer);
		for (int i = 0; i < people.get_num_of_people(); i++)
		{
			System.out.print("Name " + (i+1) + ": ");
			people.set_name(i, keyboard.next());
		}
		
		Options options;
		while (true)
		{
			System.out.print("\nHow many options: ");
			num_of_options = keyboard.nextInt();
			if (num_of_options < num_of_drawer)
			{
				System.out.println("Number of options cannot be less than number of drawers!");
			}
			else
			{
				options = new Options(num_of_options);
				break;
			}
		}
		
		for (int i = 0; i < options.get_num_of_options(); i++)
		{
			System.out.print("Option " + (i+1) + ": ");
			options.set_option(i, keyboard.next());
		}
		
		random_draw(people, options);
		
		print_result(options);
		
	}
	
	private static void random_draw(People people, Options options)
	{
		Random rand = new Random();
		for (int i = 0; i < people.get_num_of_people(); i++)
		{
			while (true)
			{
				int rand_num = rand.nextInt(options.get_num_of_options());
				if (options.get_options_taken(rand_num) == "")
				{
					options.set_options_taken(rand_num, people.get_name(i));
					break;
				}
			}
		}
	}
	
	private static void print_result(Options options)
	{
		System.out.println("\n----------Results----------");
		for (int i = 0; i < options.get_num_of_options(); i++)
		{
			if (options.get_options_taken(i) != "")
			{
				System.out.println(options.get_options_taken(i) + ": " + options.get_option(i));
			}
		}
	}

}
