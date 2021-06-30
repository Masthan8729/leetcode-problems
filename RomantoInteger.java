package org.java.leetcode;

import java.util.*;
public class RomantoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int sum=0;
		HashMap<Character,Integer> map=new HashMap<>();
		map.put('I', 1);                                           
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int cur=0,next=0;
		for(int i=0;i<s.length()-1;i++) {
			cur=map.get(s.charAt(i));
			next=map.get(s.charAt(i+1));
			if(cur<next) {
				sum=sum-cur;
			}
			else {
				sum=sum+cur;
			}
		}
		sum=sum+map.get(s.charAt(s.length()-1));
		System.out.println(sum);
	}

}
