public class Sum
{
	public static void main(String[] args)
	{
		if (args.length > 0)
		{
			int sum = 0;
			for (int i = 0; i < args.length; i++)
			{
				sum += Integer.parseInt(args[i]);
			}
			System.out.println("The sum is " + sum);
		} else
		{
			System.out.println("Calculates the sum of all arguments provided by the user in command line\nUsage: Sum [integer 1] [integer 2] ...");
		}
	}
}
