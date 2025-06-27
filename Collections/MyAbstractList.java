package Collections;

import java.util.AbstractList;
import java.util.ArrayList;

public class MyAbstractList {

	public static void main(String[] args) {
		AbstractList<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("10");
		list.add("20");

		System.out.println(list);

		// everything is same as other array list or linked list
	}

}
