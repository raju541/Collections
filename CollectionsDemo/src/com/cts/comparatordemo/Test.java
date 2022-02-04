package com.cts.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(2, "rajan", 25);
		Student s2=new Student(1, "prasad", 29);
		Student s3=new Student(3, "hari", 26);
		List<Student> list= new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		Collections.sort(list, new Idcomarator());
		
		Collections.sort(list, new Agecomparator());
		
		Collections.sort(list, new Namecomparator());
		
		for (Student student : list) { 
			  System.out.println(student); 
			  }
	}
}
