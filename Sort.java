
public class Sort 
{
	public static void main(String[] args)
	{
		int[] ar = {6,2,8,10,7,1,3,6,5,8,3,4,9,10,1};
		Sort.display(ar);
		Sort.sorter(ar);
	}
	
	static void display(int[] ar)
	{
		System.out.println("Original Numbers");
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i]);
		}
	}

	static void sorter(int[] ar)
	{
		System.out.println("Sorted Numbers");
		for(int startingPoint = 0; startingPoint < ar.length; startingPoint++)
		{
			int smallestValue = ar[startingPoint];
			int smallestValuePosition = startingPoint;
			for (int i = startingPoint; i < ar.length; i++)
			{
				if(ar[i] < smallestValue)
				{
					smallestValue = ar[i];
					smallestValuePosition = i;
				}
			}
			int save = ar[smallestValuePosition];
			ar[smallestValuePosition] = ar[startingPoint];
			ar[startingPoint] = save;
		}
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
