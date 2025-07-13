package HackerEarth_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class emptyClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine());
		int time = 0;
		LinkedList<String> arrA = new LinkedList<String>(Arrays.asList(br.readLine().trim().split("\\s+")));
		LinkedList<String> arrB = new LinkedList<String>(Arrays.asList(br.readLine().trim().split("\\s+")));
		while (!arrA.isEmpty()) {
			if (arrA.getFirst().equals(arrB.getFirst())) {
				arrA.removeFirst();
				arrB.removeFirst();
				time++;
			} else {
				arrA.addFirst(arrA.removeLast());
				time++;
			}
		}
		System.out.println(time);
	}

}
