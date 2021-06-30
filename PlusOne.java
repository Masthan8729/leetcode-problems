package org.java.leetcode;

import java.util.*;
public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(scan.nextInt());
		}
		if(list.size()==1) {
			//System.out.println();
			
			if(list.get(0)==9) {
				list.set(0, 1);
				list.add(0);
			}
			else {
				list.set(list.size()-1,list.get(0)+1);
			}
		}
		else {
			if(list.get(list.size()-1)==9) {
				list.set(list.size()-1, 0);
				if(list.get(list.size()-2)==9) {
					
				}
				list.set(list.size()-2, list.get(list.size()-2)+1);
			}
			else {
				list.set(list.size()-1, list.get(list.size()-1)+1);
			}
		}
		System.out.println(list);
	}

}
