package org.jsp;

public class string1 {
	public static void main(String[] args) {
		String s1=new String("Raja");
		String s2=new String("Rani");
		System.out.println(s1+s2);
		
		
		String s3=new String("pavan");
		String s4=new String("kumar");
		System.out.println(s3.concat(s4).concat(" ").concat(s1));
		
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
			{
				System.out.println(ch[i]);
			}
		
		String res=new String(ch);
		System.out.println(res);
		
		
		
	}

}
