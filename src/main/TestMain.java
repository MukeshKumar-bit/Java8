package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {
	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//Using Stream Api to filter even numbers and print them
		number.stream().filter(n->n%2==0).forEach(System.out::println);
		
		//Using Stream Api to filter add Numbers and print them
		number.stream().filter(n->n%2!=0).forEach(System.out::println);
		
		//using stream api to filter both even number and odd numbers and print them
		Map<Boolean, List<Integer>> evenNumberAndOddNumber=number.stream().collect(Collectors.partitioningBy(e->e%2==0));
		System.out.println(evenNumberAndOddNumber);
		
		//using stream api to filer highest number print them
		number.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
		
		
		
	}

}