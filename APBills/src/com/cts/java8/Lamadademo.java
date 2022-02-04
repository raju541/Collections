package com.cts.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lamadademo {

	public static void main(String[] args) { 
		
		
	List<String> list=new ArrayList<String>();  
    list.add("Rick");         
    list.add("Rick");       
    list.add("Rick");         
    list.add("Glenn");         
    list.add("Carl");
    List<String> result= list.stream().filter(line -> !"Rick".equals(line)).collect(Collectors.toList());
    result.forEach(          
        // lambda expression        
        (p)->System.out.println(p)         
    );     
 } 
}


	
	
	


