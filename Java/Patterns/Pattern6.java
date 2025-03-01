// package com.cdac_java.java;

public class Pattern6 {

	public static void main(String[] args) {
		int i, j, row = 4;
		for (i = 1; i <=row; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = row; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

//  ****
//   ***
//    **
//     *