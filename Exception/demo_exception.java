package Exception;

import java.util.Scanner;

public class demo_exception {
	int i;
	int[] a = {1,2,3,4,5};
	Scanner sc = new Scanner(System.in);
	
	public void array()
	{
		try 
		{
			i = sc.nextInt();
			System.out.println(a[i]);
		}
		catch(Exception e)
		{
			System.out.println("array out of bound = "+ e);
		}
		finally 
		{
			System.out.println("elements in an Array = ");
			for (int k : a)
			{
				System.out.println(k);
			}
		}
	}
}
