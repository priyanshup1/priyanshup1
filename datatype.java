package java_day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class datatype {

	public static void main(String[] args) {
		Integer number = 15;
		//prints type integer
		System.out.println(number.getClass().getSimpleName());
		System.out.println(number.getClass().getName());
		
		String s = "name";
		//print type String 
		System.out.println(s.getClass().getName());
		
		Boolean b = true;
		// print type boolean
		System.out.println(b.getClass().getTypeName());
		
		Character c = 'a';
		// print type character
		System.out.println(c.getClass().getName());
		
		Double f = 7.86;
		//print type double
		System.out.println(f.getClass().getName());
		
		//array
		String[] arr = new String[5];
        System.out.println(arr.getClass().getTypeName());
        
        //list
        List<String> l1 = new ArrayList<String>();
        System.out.println(l1.getClass().getTypeName());
        
      //list
        HashSet<String> l2 = new HashSet<String>();
        System.out.println(l2.getClass().getTypeName());



	}

}
