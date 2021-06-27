// Question-4:-Propgram to remove a particular character from a given String

import java.util.Scanner;

public class four
{
	static void charRemover(String s, char c)
	{
		int j, count = 0, n = s.length();
		char []arrayOfCharacter = s.toCharArray();

		//Checking for the character in the string
		for (int i = j = 0; i < n; i++)
		{
			if (arrayOfCharacter[i] != c)
				arrayOfCharacter[j++] = arrayOfCharacter[i];
			else
				count++;
		}
		while(count > 0)
		{
		     arrayOfCharacter[j++] = '\0';
			   count--;
		}

		System.out.println(arrayOfCharacter);
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String s = in.nextLine();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character to Remove : ");
		char c = sc.next().charAt(0);

    charRemover(s, c);//function call for removing the given character

	}
  
}
