package com.rann.offer.problem8;

public class Test {
	public static void main(String[] args) {
		RotateArray ra = new RotateArray();
		int[] a1 = {1,0,1,1,1};
		int[] a2 = {1,1,1,0,1};
		int[] a3 = {3,3,3,3,1,2,3};
		System.out.println(ra.min(a1));
		System.out.println(ra.min(a2));
		System.out.println(ra.min(a3));
	}
}
