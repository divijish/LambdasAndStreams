package com.divijish.streams;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String... args) {

		int values[] = { 23, 43, 53, 5, 7, 3, 43, 5 };

		System.out.println("Printing evens:");

		Predicate<Integer> evenFinder = (value)-> value%2 != 0;
		IntPredicate evenFinder2 = (value) -> value%2 != 0;
		
		System.out.println(IntStream.of(values).allMatch(evenFinder2));
		
		System.out.println("Printing all the elements:");
		IntStream.of(values).forEach(System.out::println);
		System.out.println("Printing smallest: ");
		System.out.println(IntStream.of(values).min().orElse(-1));
		System.out.println("Printing largest: ");
		//outputs the max value or -10 otherwise
		System.out.println(IntStream.of(values).max().orElse(-10));
		System.out.println("Printing sum: ");
		
		//summaryStatics() is faster
			System.out.println(IntStream.of(values).summaryStatistics().getMax());


	}
}
