package org.java.leetcode;

import java.util.*;
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		s=s.toLowerCase();
		String vs="";
		for(int i=0;i<s.length();i++) {
			if((int)s.charAt(i)>=97 && (int) s.charAt(i)<=122 || (int) s.charAt(i)>=48 && (int) s.charAt(i)<=57) {
				vs=vs+s.charAt(i);
			}
		}
		System.out.println(vs);
		String rev="";
		for(int i=vs.length()-1;i>=0;i--) {
			rev=rev+vs.charAt(i);
		}
		if(vs.equals(rev)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
