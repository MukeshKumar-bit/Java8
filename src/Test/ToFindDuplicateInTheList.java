package Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToFindDuplicateInTheList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,4,2,5,3,6,3,4,5);
		Set<Integer> l=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(l);
		
	}

}
