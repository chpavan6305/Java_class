package org.jsp.stringBuilder;

import java.util.Scanner;

public class StringReverse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		char newArr[]=new char[arr.length];
		int j=newArr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			newArr[j]=arr[i];
			j--;
		}
		String revArr=new String(newArr);
		System.out.println("Original String: "+str);
		System.out.println("Reverse String: "+revArr);
	}
}