package capgamini;

import java.util.*;

class student
{
	String name;
	String section;
	int id;
	
	public void stdinfo()
	{
		System.out.println("NAME : "+""+this.name);
		System.out.println("SECTION : "+""+this.section);
		System.out.println("ID : "+""+this.id);
	}

	
}

public class class_n_obejects {

	public static void main(String[] args) {
		student s1 =new student();
		s1.name = "priyanshu";
		s1.section = "com2";
		s1.id=0116;
		
		//call the method
		s1.stdinfo();
	}

} 



