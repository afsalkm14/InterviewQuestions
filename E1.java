// Question-E1

import java.util.*;
import java.util.Scanner;

public class E1
{
	// For Pushing all zeros to end of the array
	static void pushToEnd(int arr[], int n)
	{
		int count = 0;

		// Traverse of the array. If element is non zero then it replace with index of count
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i];//Count is incrimented

		// Here all non-zero elements have been shifted to front  and count=index of first zero
		while (count < n)
			arr[count++] = 0;
	}

	// Rearranging the array
	static void rearrangeArray(int arr[], int n)
	{

		if (n == 1)//if array has only 1 element
			return;

		pushToEnd(arr, n);
		for (int i = 0; i < n - 1; i++)
		{

			if ((arr[i] != 0) && (arr[i] == arr[i + 1]))
			{

				arr[i] = 2 * arr[i];
				arr[i + 1] = 0;
				i++;
			}

		}

		pushToEnd(arr, n); //pushing all zeros to end of array
	}

	//printing Array
	static void show(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args)
	{

		int numberOfElements;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		numberOfElements = sc.nextInt();
   	int arr[] = new int[numberOfElements];
		System.out.println("Enter the elements :");
		for(int i=0; i<numberOfElements; i++)
		{
			arr[i]=sc.nextInt();
		}

		int arrayLength = arr.length;

		System.out.print("Initial array: ");
		show(arr, arrayLength);

		rearrangeArray(arr, arrayLength);

		System.out.print("Modified array: ");
		show(arr, arrayLength);
	}

}
