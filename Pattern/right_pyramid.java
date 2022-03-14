package Pattern;

import java.util.Scanner;

public class right_pyramid {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input : \n");
		a = sc.nextInt();
		for(int i =0;i<=a;i++)
		{
			for (int j = 1;j<=i;j++)
			{
				System.out.print("*"+"");
			}
			System.out.println("");
		}


	}

}
