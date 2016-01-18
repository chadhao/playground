
public class People
{
	private int num_of_people;
	private String[] names;
	
	public People(int num_of_people)
	{
		this.num_of_people = num_of_people;
		names = new String[num_of_people];
		
		for (int i = 0; i < num_of_people; i++)
		{
			names[i] = "";
		}
	}
	
	public String get_name(int index)
	{
		return names[index];
	}
	
	public void set_name(int index, String name)
	{
		names[index] = name;
	}
	
	public int get_num_of_people()
	{
		return num_of_people;
	}
}
