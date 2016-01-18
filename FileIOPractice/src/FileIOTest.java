import java.io.*;
import java.util.Scanner;

public class FileIOTest
{

	public static void main(String[] args)
	{
		Scanner in;
		PrintWriter out;
		try
		{
			in = new Scanner(new InputStreamReader(new FileInputStream("/Users/Chad/Downloads/scores.txt"), "UTF-8"));
			out = new PrintWriter(new FileWriter("/Users/Chad/Downloads/grades.txt"), true);
		}
		catch(IOException ioe)
		{
			in = null;
			out = null;
		}
		String line;
		while (in.hasNextLine())
		{
			line = in.nextLine();
			String[] tokens = line.split(" ");
			String name = tokens[0];
			int score = Integer.parseInt(tokens[1]);
			char grade = 'D';
			if (score >= 80 && score <= 100)
			{
				grade = 'A';
			}
			else if (score >= 65 && score <= 79)
			{
				grade = 'B';
			}
			else if (score >= 50 && score <= 64)
			{
				grade = 'C';
			}
			out.print(name + " " + grade);
			out.println();
		}
		in.close();
		out.close();
	}

}
