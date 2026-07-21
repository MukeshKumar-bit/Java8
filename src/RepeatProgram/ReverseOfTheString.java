package RepeatProgram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseOfTheString {
    public static void main(String[] args) {
        String str="java concept of the day";
       String rev= Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(""));
        System.out.println(rev);
    }
}
