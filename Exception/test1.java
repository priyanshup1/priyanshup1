package Exception;

public class test1 {

	public static void main(String[] args)  {
		division d = new division();
		try {
			d.inputcheck();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
/*__________________________________________________________________________________*/
		try {
			
			int a = d.div(100, 10);
			System.out.println("Answer = "+a);
		}
		catch (Exception e)
		{
			throw new ArithmeticException("\n Stupid! \n Never divide number with Zero");
		}
		
	}

}
