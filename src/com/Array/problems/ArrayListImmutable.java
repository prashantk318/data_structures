package com.Array.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListImmutable {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Kali");
		list.add("Sneha");
		list = Collections.unmodifiableList(list);
		list.add("prashant");
		System.out.println(list);
	}

}
