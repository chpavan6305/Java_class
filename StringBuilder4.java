package org.jsp.stringBuilder;

public class StringBuilder4 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("pavan");
		System.out.println(sb);//pavan
		String res=sb.toString();
		System.out.println(res);//pavan
		
		res.concat("kumar");
		System.out.println(res);//pavan
		
	}

}
