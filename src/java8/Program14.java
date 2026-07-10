package java8;

import java.util.Arrays;
import java.util.List;

public class Program14 {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("java","c++");
		//count the element in the list
		Long count=list.stream().count();
	System.out.println(count);	
	}

}
