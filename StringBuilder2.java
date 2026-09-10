package org.jsp.stringBuilder;

public class StringBuilder2 {
	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder("java");
		System.out.println(builder);//java
		
		builder.append("Program");//javaProgram
		System.err.println(builder);
		
		StringBuilder builder2=new StringBuilder();
		builder2.ensureCapacity(100);
		System.out.println(builder2.capacity());//100
		
	}

}
