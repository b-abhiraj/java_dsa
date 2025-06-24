package Day0;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				a.add(j);
			}
			b.addAll(0, a);
			a.clear();
		}
		System.out.println(b);
	}

}
