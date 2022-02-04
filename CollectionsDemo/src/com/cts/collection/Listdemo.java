package com.cts.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list=new Vector<Integer>();
		//List<Integer> list=new ArrayList<Integer>();
		//List<Integer> list=new LinkedList<Integer>();
		
		list.add(5);
		
		list.add(4);
		list.add(4);
		list.add(4);
		
		list.add(3);
		
		list.add(2);
		//System.out.println(list);
		/*
		 * for(int i=0;i<list.size();i++) {
		 * 
		 * 
		 * System.out.println(list.get(i)); }
		 */
		
		/*
		 * Iterator<Integer> itr=list.iterator(); 
		 * 
		 * while(itr.hasNext()) {
		 * 
		 * System.out.println(itr.next());
		 * 
		 * }
		 */
		
		for (Integer p : list) {
			System.out.println(p);
		}
	}

}
