package Pattern;

import java.util.Scanner;

public class left_pyramid {

	public static void main(String[] args) {
		int i, j;
		 
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input : \n");
		n = sc.nextInt();
		
        for(i=0; i<n; i++)
        {
            for(j=2*(n-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

	}
