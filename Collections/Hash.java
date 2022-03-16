package List;

import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {

		Set  s = new HashSet();
		emp e1 = new emp(1,"banana");
		emp e2 = new emp(2,"apple");
		emp e3 = new emp(3,"orange");
		emp e4 = new emp(3,"pineapple");
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		System.out.println(s);
		
	}

}