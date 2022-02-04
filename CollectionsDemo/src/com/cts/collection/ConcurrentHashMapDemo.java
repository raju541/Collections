package com.cts.collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		//ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<Integer,String>();
		map.put(1,"raju");
		map.put(2,"hari");
		map.put(3,"nani");
		//map.put(null, "prasad");  		//NullPointerException
		Set<Integer> keys=map.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()) {
		Integer it	=itr.next();
		map.remove(it);
			System.out.println(map.get(it));
			
		}
		
		
	}

}
