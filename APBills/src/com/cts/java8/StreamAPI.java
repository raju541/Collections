package com.cts.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<Product>();  
	    //Adding Products  
	    productsList.add(new Product(1,"HP Laptop",25000f));  
	    productsList.add(new Product(2,"Dell Laptop",30000f));  
	    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	    productsList.add(new Product(4,"Sony Laptop",28000f));  
	    productsList.add(new Product(5,"Apple Laptop",90000f));  
	    
	    Stream<Product> st=  productsList.stream();
	    Set<Integer>productPriceList = st.map(x->x.id).collect(Collectors.toSet());
	    		   
	    System.out.println(productPriceList);
	}

}
