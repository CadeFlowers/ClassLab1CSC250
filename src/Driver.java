import java.util.Arrays;
public class Driver
{
	public static void main(String[] args) 
	{
		int[] intArray = {13,4,36,101,2};
		System.out.println(Arrays.toString(intArray));
		SelectionSort(intArray);
		System.out.println(Arrays.toString(intArray));
	}
	static void SelectionSort(int[] intArray) 
	{
		int start = 0;
		int swapPos, temp;
		while(start < intArray.length) 
		{
			swapPos = start;
			for(int i = start + 1; i < intArray.length; i++) 
			{
				if(intArray[i] < intArray[swapPos]) 
				{
					swapPos = i;
				}
			}
			temp = intArray[start];
			intArray[start] = intArray[swapPos];
			intArray[swapPos] = temp;
			start++;
		}
	}
	
}
