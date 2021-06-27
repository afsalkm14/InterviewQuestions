// Question-5:-Program to check if array contains contiguous integers with duplicates allowed

import java.util.*;

public class five
{
	//function to check elements are contiguos or not
	static boolean contiguousCheck(int arr[],int n)
	{

		Arrays.sort(arr);//Sorting array

		for (int i = 1; i < n; i++)
			if (arr[i] - arr[i-1] > 1)//checking current element is same as previous
				return false;
		return true;
	}

	public static void main(String[] args)
	{

		int numberOfElements;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		numberOfElements=sc.nextInt();
		int arr[] = new int[numberOfElements];
		System.out.println("Enter the elements :");
		for(int i=0; i<numberOfElements; i++)
		{
			arr[i]=sc.nextInt();
		}
		int arrayLength = arr.length;

		if (contiguousCheck(arr, arrayLength))
			System.out.println("\n Yes");
		else
			System.out.println("\n No");

	}

}
