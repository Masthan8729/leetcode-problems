package org.java.leetcode;

import java.util.*;
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int v=scan.nextInt();
		if(arr.length==0) {
			System.out.println(0);
		}
		else {
			int j=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=v) {
					arr[j]=arr[i];
					j++;
				}
			}
			for(int i=0;i<j;i++) {
				System.out.println(arr[i]);
			}
		}
	}

}
