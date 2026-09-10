package org.jsp.stringBuilder;

public class StringBuilder1 {
	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder();
		System.out.println(builder.capacity());//16
		System.out.println(builder.length());//0
		
		builder.append("java");
		System.out.println(builder.capacity());//16
		System.out.println(builder.length());//4
		
		builder.append(" is a programming language");
		System.out.println(builder.capacity());//34
		System.out.println(builder.length());//30
		
		builder.append(" and object oriented programming");
		System.out.println(builder.capacity());//70
		System.out.println(builder.length());//62
		
	}

}
