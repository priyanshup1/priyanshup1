package Exception;
import java.util.*;
public class division {
	int div(int a , int b) throws ArithmeticException
	{
		int i = a/b;
		return i;
	}
	
	
	public void inputcheck() throws Exception
	{
		int a =0;
		double d = 0.0;
		String s;
		Scanner sc = new Scanner(System.in);
		try
		{
			a = sc.nextInt();
			d = sc.nextDouble();
			s = sc.next();
			System.out.println(a+"\n"+d+"\n"+s);
		}
		catch(Exception e)
		{
			throw new InputMismatchException("Wrong input order!!!");
		}
		
	}

}

