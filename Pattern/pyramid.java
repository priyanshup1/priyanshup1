package Pattern;

import java.util.Scanner;

public class pyramid {

	public void pyramid(int n)
	{
		for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	public void rightpy(int a)
	{
		for(int i =0;i<=a;i++)
		{
			for (int j = 0;j<=i;j++)
			{
				System.out.print("*"+"");
			}
			System.out.println("");
		}
	}
	
	public void leftpy(int n)
	{
		
		
        for(int i=0; i<n; i++)
        {
            for(int j=2*(n-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		int n ;
		pyramid py = new pyramid();
		System.out.println("enter the choice....\n");
		System.out.println("1: pyramid  2: right_pyramid   3: left_pyramid");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("enter the input : \n");
			n = sc.nextInt();
			py.pyramid(n);
			break;
		case 2:
			System.out.println("enter the input : \n");
			n = sc.nextInt();
			py.rightpy(n);
			break;
		case 3:
			System.out.println("enter the input : \n");
			n = sc.nextInt();
			py.leftpy(n);
			break;
		default :
			System.out.println("Invalid...");
		}
		
	}

}
