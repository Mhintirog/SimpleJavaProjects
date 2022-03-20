public class maxValue 
{
	public static void main(String[] args) 
	{

		int array[] = new int[] { 10, 25, 2, 54, 100, 80, 13 };

		int max = array[0];
		int index = 0;

		for (int i = 0; i < array.length; i++) 
		{
			if (max < array[i]) 
			{
				max = array[i];
				index = i+1;
			}
		}

		System.out.println("The Max Value is: " +max +" And the position is: " +index);
    } 
}



   