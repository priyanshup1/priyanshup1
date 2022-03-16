package java_day8_COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Colldemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList();
		c.add("aaa");
		c.add("bbb");
		c.add("ccc");
		System.out.println(c);
		
		System.out.println(c.contains("fff"));
		System.out.println(c.size());

		
		//_________________________Iterator ___________________
		for(String i : c)
		{
			if(i.contains("aaa"))
			System.out.print(i+" : trueeeee \n ");
		}
		
		System.out.println(c.remove("aaa"));
		System.out.println(c);
	
			}
	}


