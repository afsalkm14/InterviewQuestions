//Question-7

import java.util.*;

public class seven
{
	public static int[] collitionHappening(int[] asteroids)
  {
        Stack<Integer> stack = new Stack<>();
        for(int i: asteroids)
        {
            if(i > 0)
            {
            	stack.push(i);
            }
            else
            {
               	// when the astroid  is negative
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(i) )
                {
                    //  if the astroid comming from other side is there,(ie positive,) and if the side of other
                    //  side astroid is less, remove the old astroid
                	  stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0)
                {
                	stack.push(i);
                }
                	else if(i + stack.peek() == 0)
                  {
                	   stack.pop(); // when both astroid are having same sixe and they are movin opposite . then remove that from list
                  }
            }
        }
        int[] res = new int[stack.size()];
        for(int i = res.length - 1; i >= 0; i--)
        {
            res[i] = stack.pop();
        }
        return res;
    }

    public static void main(String[] args)
    {
  	     Scanner sc = new Scanner(System.in);
	       System.out.print("Enter the size of the array : ");
		     int size = sc.nextInt();
         int arr[] = new int[size];
         System.out.println("Enter no of elements : ");
		     for(int i=0;i<size; i++)
         {
		         arr[i] = sc.nextInt();
		     }

         // call the method to collitionHappening
		      int[] newArray = collitionHappening(arr);

		      for(int i=0;i<newArray.length; i++)
          {

			           System.out.print(newArray[i]);
                System.out.print(" , ");
		      }

	   }

}
