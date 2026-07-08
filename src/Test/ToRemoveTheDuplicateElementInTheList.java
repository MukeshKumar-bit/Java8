package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToRemoveTheDuplicateElementInTheList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,2,3,3,4,3,5);
		Set<Integer> l=list.stream().distinct().collect(Collectors.toSet());
		System.out.println(l);
	}

}
