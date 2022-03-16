package List;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class list{
public void list1()
{
	List<String> l1 = new ArrayList<String>();
	ArrayList<Integer> l = new ArrayList<Integer>();
	l1.add("banana");
	l1.add("apple");
	l1.add("orange");
	l1.add("grapes");
	l1.add("pineapple");
	l1.add("watermelon");
	System.out.println(l1);
	Collections.sort(l1);
	System.out.println(l1);
	//System.out.println();
//	System.out.println("count = "+l1.size());
//	System.out.println("sorted ="+l1.stream().sorted().collect(Collectors.toList()));
//	System.out.println(l1.stream().findFirst());
//	System.out.println("joins = everything "+l1.stream().sorted().collect(Collectors.joining()));
} 
}
public class arraylist {
	public static void main(String[] args) {
	list l = new list();
	l.list1();
}
}
