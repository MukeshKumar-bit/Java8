package Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ToFindTheMaxIntegerInTheList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,2,5,7,4);
		int i=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(i);
	}

}
