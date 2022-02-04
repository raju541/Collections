package com.cts.comparatordemo;

public class StringReverce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=StringReverce.reverse("prasad");
	      //System.out.println(str);
		
		str=StringReverce.reverseRecursively("abc");
		System.out.println(str);
		
		/*
		 * String s="prasad"; 
		 * StringBuffer st=new StringBuffer(s); 
		 * String revs=st.reverse().toString();
		 * 
		 * System.out.println(revs);
		 */	
	}
	
	public static String reverse(String str) {
			 
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }
        return strBuilder.toString();
}
	
	  public static String reverseRecursively(String str) {

	        //base case to handle one char string and empty string
	        if (str.length() < 2) {
	            return str; }
	        System.out.println(str.substring(1));
	        System.out.println( str.charAt(0));
	        return reverseRecursively(str.substring(1)) + str.charAt(0);

	    }
}