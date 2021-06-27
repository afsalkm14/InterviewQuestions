//question-6:- Task is to rearrange the people by their heights in a non-descending order without moving the trees.

import java.util.*;

public class six
{
    public static void sortByHeight(int []arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == -1)
                    break;
                if( arr[j] == -1)
                    continue;
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // for displaying the array
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
	       Scanner sc = new Scanner(System.in);
		     System.out.print("Enter the Size of the Array : ");
		     int size = sc.nextInt();
         int arr[] = new int[size];
		     System.out.println("Enter the Elements : ");
         for(int i=0;i<size; i++)
         {
		         arr[i] = sc.nextInt();
		     }
         //call the function to sort
		     sortByHeight(arr);
	}

}
