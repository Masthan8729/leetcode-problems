package org.java.leetcode;

import java.util.*;
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(scan.nextInt());
		}
		int t=scan.nextInt();
		if(list.contains(t)) {
			System.out.println(list.indexOf(t));
		}
		else {
			list.add(t);
			Collections.sort(list);
			System.out.println(list.indexOf(t));
		}
	}

}
