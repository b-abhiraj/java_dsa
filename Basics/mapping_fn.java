package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class mapping_fn {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		// map to string
		list.stream().map(number -> number * 3).forEach(System.out::println);

		List<String> li = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");
		List<String> answer = li.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(answer);

		List<String> li1 = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");
		li1.stream().map(s -> s.length()).forEach(System.out::println);

		// map to int
		List<String> li2 = Arrays.asList("3", "6", "8", "14", "15");

		li2.stream().mapToInt(num -> Integer.parseInt(num)).filter(num -> num % 3 == 0).forEach(System.out::println);

		// optionalInt
		IntStream stream = IntStream.of(10, 20, 30);
		OptionalInt out = stream.max();
		System.out.println(out.getAsInt());

		// skip function
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(-2);
		list1.add(0);
		list1.add(2);
		list1.add(4);
		list1.add(6);
		list1.add(8);
		list1.add(10);
		list1.add(12);
		list1.add(14);
		list1.add(16);
		list1.add(18);

		int limit = 4;
		int count = 0;

		Iterator<Integer> it = list1.iterator();

		while (it.hasNext()) {
			it.next();
			count++;

			if (count <= limit) {
				it.remove();
			}
		}
		for (Integer number : list1) {
			System.out.print(number + " ");
		}
		System.out.println("\n");

		Optional<Integer> op1 = Optional.of(9544);
		System.out.println(op1);
		op1.stream().forEach(System.out::println);

		Optional<Integer> op2 = Optional.empty();
		System.out.println(op2);

		// map to long
		List<String> li3 = Arrays.asList("25", "225", "1000", "20", "15");
		li3.stream().mapToLong(num -> Long.parseLong(num)).filter(num -> Math.sqrt(num) / 5 == 3)
				.forEach(System.out::println);

		List<String> li4 = Arrays.asList("Data Structures", "JAVA", "OOPS", "GeeksForGeeks", "Algorithms");
		li4.stream().mapToLong(s -> Long.bitCount(s.length())).forEach(System.out::println);

		// map to Double
		List<String> li5 = Arrays.asList("10", "6.548", "9.12", "11", "15");
		li5.stream().mapToDouble(s -> Double.parseDouble(s)).filter(num -> (num * num) * 2 == 450)
				.forEach(System.out::println);

		List<String> li6 = Arrays.asList("CSE", "JAVA", "gfg", "C++", "C");
		li6.stream().mapToDouble(s -> s.length() * s.length()).forEach(System.out::println);
	}

}
