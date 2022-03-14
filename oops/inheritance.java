package capgamini;
//import java.util.*;

//parents class
class member
{
	String Name;
	int Age;
	int Pno;
	String Address;
	double Salary;
	
	public void print() 
	{
		System.out.println("Salary : "+ Salary);
	}
}

class emp extends member
{
	String specialization;
	//System.out.println("specialization : "+ specialization);
	
}

class manager extends emp
{
	String department;
	//System.out.println("department : "+ department);
	
}


public class inheritance {

	public static void main(String[] args) {
		// create a object
//		emp info = new emp();
//		manager info1 = new manager();
//		info.Salary=20000.0;
//		info1.department = "technology";
//		info.specialization = "btech";
//		info.print();
		manager m = new manager();
		m.Salary = 300000.0;
		m.print();

	}

}
