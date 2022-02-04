package com.cts.collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set=new TreeSet<Integer>();
		
		set.add(5);
		set.add(4);
		set.add(3);
		set.add(3);
		set.add(2);
		set.add(1);
		//set.add(null);
		//set.add(null);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
