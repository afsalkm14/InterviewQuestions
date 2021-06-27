// Question-2:- You will be given any number n and add the digits ,and find the sum until sum became single digit

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class two
{

	static int SumofDigit(int n)
	{
		int sum = 0; //initialize sum with zero
		while (n > 0 || sum > 9) //loop will work until sum is not less than or equal to 9
		{
			if (n == 0)
			{
				n = sum;
				System.out.println(sum);
				sum = 0;

			}
			sum=sum + n % 10;
			n = n / 10;

		}

		return sum;
	}

	public static void main(String args[])
	{
		int n;
		System.out.print("Enter the Number:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		System.out.println("The last sum is : " +SumofDigit(n));
	}

}
