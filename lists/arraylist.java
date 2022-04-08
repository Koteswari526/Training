package lists;
import java.util.*;
public class arraylist {
public static void main(String[] args) {
	ArrayList<String> li = new ArrayList<String>();
	li.add("cat");
	li.add("dog");
	li.add("giraffee");
	li.add("lion");
	li.add("kangaroo");
	li.add("cat");
	li.add("tiger");
	Iterator il = li.iterator();
	while(il.hasNext()) {
		System.out.println(il.next());
	}
	ArrayList<Integer> li2 = new ArrayList<Integer>();
	li2.add(20);
	li2.add(30);
	li2.add(40);
	li2.add(50);
	li2.add(60);
	Collections.sort(li2);
	for(Integer no:li2) {
		System.out.println(no);
	}
}
}
