package org.java.leetcode;

import java.util.*;
public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=scan.nextInt();
		}
		int target=scan.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		list.add(-1);
		list.add(-1);
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				list.set(0, i);
				break;
			}
		}
		for(int j=nums.length-1;j>=0;j--) {
			if(nums[j]==target) {
				list.set(1, j);
				break;
			}
		}
        System.out.println(list);
	}

}
