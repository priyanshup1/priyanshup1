package capgamini;

abstract class college1
{
	public void collinfo()
	{
		System.out.println("wellcome to the college");
	}
	public abstract void collfee();
}
class student1 extends college1
{

	@Override
	public void collfee() {
		System.out.println("college fee is 5L");
	}
	
}

public class abstraction {

	public static void main(String[] args) {

		student1 coll = new student1();
		coll.collinfo();
		coll.collfee();
		

	}

}
