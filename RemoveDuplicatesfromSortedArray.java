package org.java.leetcode;

import java.util.*;
public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int i=1;
		if(arr.length==0) {
			System.out.println(0);
		}
		else {
			
			for(int j=1;j<arr.length;j++) {
				if(arr[j]!=arr[j-1]) {
					arr[i]=arr[j];
					i++;
				}
			}
		}
		for(int x=0;x<i;x++) {
			System.out.println(arr[x]);
		}
		//System.out.println(Arrays.toString(arr));
	}

}
