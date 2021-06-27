// Question-8:-Program to find the minimal length of the jump enough to avoid all the obstacles

import java.util.*;

public class eight
{
	static int obstacles(int[] obs)
	{
		// Insert all array elements in a hash table and find the maximum value in the array

		HashSet<Integer> hs = new HashSet<Integer>();
		int max = obs[0];
		for (int i=0; i<obs.length; i++)
		{
			hs.add(obs[i]);
			max = Math.max(max, obs[i]);//to find max value
		}

		// checking for every possible length which yield us solution
		for (int i = 1; i <= max; i++)
		{
			int j;
			for (j = i; j <= max; j = j + i)
			{

				if (hs.contains(j))
					break; // Break the loop if there is an obstacle
			}

			if (j > max)
				return i;
		}

		return max+1;
	}

	public static void main(String[] args)
	{

		int size;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		size=sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements :");
		for(int i=0; i<size; i++)
		{  
			array[i]=sc.nextInt();
		}

		int obj = obstacles(array);
		System.out.println(" \n " +obj);
	}

}
