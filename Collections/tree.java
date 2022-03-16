package List;

import java.util.TreeSet;

public class tree {

	public static void main(String[] args) {
		TreeSet<String> l1 = new TreeSet<String>();
		l1.add("banana");
		l1.add("apple");
		l1.add("orange");
		l1.add("grapes");
		l1.add("pineapple");
		l1.add("pineapple");  // Treeset doesn't allow duplicate values
		l1.add("watermelon");
		System.out.println(l1);
		

	}

}
