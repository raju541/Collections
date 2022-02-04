package com.cts.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Student implements Comparable<Student> {
   int rollno;  
	String name;  
	int age;
	
	
	public Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	} 
	
	
	@Override
	public int compareTo(Student st){  
		// return this.name.compareTo(st.name);
		
		  if(age==st.age) return 0; 
		  else if(age>st.age) return 1; 
		  else return -1;
		   
		}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<Student>();    
		Student s1=new Student(5,"prasad",30);
		Student s2=new Student(2,"pp",3);
list.add(s1);
list.add(s2);
for (Student st : list) {
	System.out.println("before sorting");
	System.out.println(st.rollno+" "+st.name+" "+st.age);   
	}
Collections.sort(list);
for (Student st : list) {
	System.out.println("after sorting");
	System.out.println(st.rollno+" "+st.name+" "+st.age);   
	}


	}
}
