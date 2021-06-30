package org.java.leetcode;

import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x=n,rem=0,rev=0;
		if(n>0) {
			while(n!=0) {
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			System.out.println(rev);
			if(x==rev) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
		else {
			System.out.println(false);
		}
	
	}

}
