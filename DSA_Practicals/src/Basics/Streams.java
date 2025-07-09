package Basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {

		Stream<String> stream1 = Stream.of("Geeks");
		stream1.forEach(System.out::println);

		Stream<Integer> stream2 = Stream.of(1);
		stream2.forEach(System.out::println);

		Stream<Long> stream3 = Stream.of(4L);
		stream3.forEach(System.out::println);

		List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10);
		list.stream().peek(System.out::println);

		list.stream().peek(System.out::println).forEach(x -> {
		});
	}

}
