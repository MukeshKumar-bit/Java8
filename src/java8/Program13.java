package java8;

import java.util.Arrays;
import java.util.List;

public class Program13 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> evenumber=list.stream().filter(e->e%2==0).toList();
		System.out.println(evenumber);
	}

}
