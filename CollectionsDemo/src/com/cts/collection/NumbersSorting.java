package com.cts.collection;
import java.util.ArrayList;
import java.util.*;

public class NumbersSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);

	}

}
