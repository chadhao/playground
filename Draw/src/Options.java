
public class Options
{
	private int num_of_options;
	private String[] options;
	private String[] options_taken;
	
	public Options(int num)
	{
		num_of_options = num;
		options = new String[num];
		options_taken = new String[num];
		
		for (int i = 0; i < num; i++)
		{
			options[i] = "";
			options_taken[i] = "";
		}
	}
	
	public int get_num_of_options()
	{
		return num_of_options;
	}
	
	public void set_option(int index, String option)
	{
		options[index] = option;
	}
	
	public String get_option(int index)
	{
		return options[index];
	}
	
	public void set_options_taken(int index, String name)
	{
		options_taken[index] = name;
	}
	
	public String get_options_taken(int index)
	{
		return options_taken[index];
	}
	
}
