
public class MergeSort
{
	public static void main(String[] args) 
	{
		int[] ar = {7,8,1,3,4,2};
		MergeSort.display(ar, 0, ar.length-1);
		MergeSort.mergeSort(ar);
		MergeSort.display(ar, 0, ar.length-1);
	}

	static void mergeSort(int[] ar)
	{
		MergeSort.mergeSortHelper(ar, 0, ar.length-1);
	}

	static void mergeSortHelper(int[] ar, int begin, int end)
	{
		//MergeSort.display(ar, begin, end);
		if(begin != end)
		{
			int leftBegin = begin;
			int leftEnd = ((end-begin)/2 + begin);
			int rightBegin = ((end-begin)/2 + begin) + 1;
			int rightEnd = end;
			MergeSort.mergeSortHelper(ar, leftBegin, leftEnd);
			MergeSort.mergeSortHelper(ar, rightBegin, rightEnd);
			
			int[] temp = new int[end - begin + 1];
			for(int i = 0; i < temp.length; i++)
			{
				if(leftBegin > leftEnd)
				{
					temp[i] = ar[rightBegin];
					rightBegin++;
				}
				else if(rightBegin > rightEnd)
				{
					temp[i] = ar[leftBegin];
					leftBegin++;
				}
				else 
				{
					if(ar[leftBegin] < ar[rightBegin])
					{
						temp[i] = ar[leftBegin];
						leftBegin++;
					}
					else
					{
						temp[i] = ar[rightBegin];
						rightBegin++;
					}
				}
			}
			for(int i = 0; i < temp.length; i++)
			{
				ar[begin + i] = temp[i];
			}
			//when we return here, we have two partially sorted lists
			//now we need to merge them together into a single list
			//where all the values are sorted.  Create a new array of
			//the correct length, then perform the merge algorithm to fill
			//that array with the correct data.  Then copy the contents
			//of that array back over the original array from begin to end
		}
	}

	static void display(int[] ar, int begin, int end)
	{
		for(int i = begin; i <= end; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println("");
	}
}