package capgamini;

import java.util.*;

class college
{
	public void student(String name,int id)
	{
		System.out.println("Name : "+""+name+"\n"+"ID : "+id);
	}
	public void student(int id , double cgpa)
	{
		System.out.println("ID : "+""+id+"\n"+"CGPA : "+cgpa);
	}
	public void student(String name,String sec)
	{
		System.out.println("NAME : "+""+name+"\n"+"section : "+sec);
	}
}


public class polymorphism {

	public static void main(String[] args) {
		//create an object
		college std = new college();
		std.student("priyanshu",116);
		std.student(116, 8.08);
		std.student("prinyashu", "com2");
	}

}
