//Question-1:-Find the nth smallest element in any given array

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class first
{

	public static int nthsmallest(Integer[] arr,int n)//function to return nth smallest
	{

		Arrays.sort(arr);//Sorting the Array
		return arr[n - 1];
	}

	public static void main(String[] args)
	{
		Integer m;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		m=sc.nextInt();

		Integer arr[] = new Integer[m];
		System.out.println("Enter the elements :");
		for(int i=0; i<m; i++)
		{
			arr[i]=sc.nextInt();
		}
		int n;
		System.out.println("Enter the Position to find the smallest value:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.print(n +" th smallest element is "+nthsmallest(arr, n));

	}

}
