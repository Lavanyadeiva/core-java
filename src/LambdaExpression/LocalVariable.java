package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LocalVariable {
	
	 public static void main(String[] args) {
	 List<Integer> intSeq = Arrays.asList(1,2,3);
	int var=10;
	 intSeq.forEach(x -> System.out.println(x + var));
	 // intSeq.forEach(System.out::println); o/p is 1,2,3
}}
