package com.PredicateCollectorStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample1 {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("Jon","Ajeet","Steve","Ajeet","Jon","Ajeet");
		Map<String,Long> map = name.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}

}
