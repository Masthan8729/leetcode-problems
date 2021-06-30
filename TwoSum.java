package org.java.leetcode;

import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(scan.nextInt());
		}
		int t=scan.nextInt();
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)+list.get(j)==t) {
					//System.out.println("i = "+i+" j = "+j);
					res.add(i);
					res.add(j);
				}
			}
		}
		System.out.println(res);
		int a[]= {1,2,3};
		List<int[]> test=Arrays.asList(a);
		res.toArray();
		System.out.println(res);
	}

}
