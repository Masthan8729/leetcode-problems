package org.java.leetcode;

import java.util.*;
public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		ArrayList<Integer> listOne=new ArrayList<>();
		ArrayList<Integer> listTwo=new ArrayList<>();
		for(int i=0;i<n;i++) {
			listOne.add(scan.nextInt());
		}
		for(int i=0;i<m;i++) {
			listTwo.add(scan.nextInt());
		}
		listOne.addAll(listTwo);
		Collections.sort(listOne);
		if(listOne.size()%2==1) {
			System.out.println(listOne.get(listOne.size()/2));
		}
		else {
			float f=(float)(listOne.get(listOne.size()/2)+listOne.get(listOne.size()/2-1))/2;
			System.out.printf("%.5f",f);
		}
	}

}
