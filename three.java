// Question-3 :-Propgram to find the least frequent element in an array

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class three
{

	static int least_frequent(int array[], int n)
	{

		// Sorting the array
		Arrays.sort(array);

		// find the min frequency using linear traversal
		int min_count = n+1, res = -1;
		int curr_count = 1;

		for (int i = 1; i < n; i++)
		{
			if (array[i] == array[i - 1])
			{
				curr_count++;
			}
			else
			{
				if (curr_count < min_count)
				{
					min_count = curr_count;
					res = array[i - 1];
				}

				curr_count = 1;
			}
		}

		// If last element is least frequent then
		if (curr_count < min_count)
		{
			min_count = curr_count;
			res = array[n - 1];
		}

		return res;
	}

	public static void main(String args[])
	{
		int numberOfElements;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		numberOfElements=sc.nextInt();
		int array[] = new int[20];
		System.out.println("Enter the elements :");
		for(int i=0; i<numberOfElements; i++)
		{
			array[i]=sc.nextInt();
		}
		int arrayLength = array.length;
		System.out.print("The Least Frequent Element is \t " +least_frequent(array,arrayLength));

	}

}
