package com.cts.collection;
import java.util.*;
import java.util.Map.Entry;

public class Hashmapdemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();  
      
		map.put(1,"Amit");  
		map.put(2,null);  
		map.put(3,null); 
		map.put(3, "hari");
		map.put(6,"Amit");
      
		Set<Entry<Integer, String>> set=map.entrySet();
		Iterator<Entry<Integer, String>> itr=set.iterator();  
		while(itr.hasNext())
		{  
			Entry<Integer, String> entry=itr.next();  
			System.out.println(entry.getKey()+" "+entry.getValue());  
		}  
}

}
