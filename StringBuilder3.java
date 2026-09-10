package org.jsp.stringBuilder;

public class StringBuilder3 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("java");
		System.out.println(sb);//java
		sb.append("Program");
		System.out.println(sb);//javaProgram
		
		sb.insert(0, "Python");
		System.out.println(sb);//PythonjavaProgram
		
		sb.delete(0, 4);
		System.out.println(sb);//onjavaProgram
		
		sb.reverse();
		System.out.println(sb);//margorPavajno
	}

}
