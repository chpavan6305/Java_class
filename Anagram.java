package org.jsp.stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		if(str1.length()!=str2.length())
		{
			System.out.println("NOT anagram");
			return;
		}
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String s1=new String(ch1);
		String s2=new String(ch2);
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Both strings are anagrams");
		}
		else
		{
			System.out.println("Both strings are not anagrams");
		}
		
		
	}

}
