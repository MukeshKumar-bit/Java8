package Test;

import java.util.Arrays;
import java.util.List;

public class CountOfStringCharacter {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,5,8,9,8,7,6,5);
		long l=list.stream().count();
		System.out.println(l);
	}

}