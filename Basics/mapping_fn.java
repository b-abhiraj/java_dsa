package Basics;

import java.util.Arrays;
import java.util.List;

public class mapping_fn {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.stream().map(number -> number * 3).forEach(System.out::println);
	}

}
