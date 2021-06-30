package org.java.leetcode;

import java.util.*;
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		long rev=0,rem=0;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			
			n=n/10;
		}
		if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE) {
			System.out.println(0);
		}
		else {
			System.out.println(rev);
		}
		
		
	}

}
