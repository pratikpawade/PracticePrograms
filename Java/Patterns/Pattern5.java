// package com.cdac_java.java;

public class Pattern5 {

	public static void main(String[] args) {
		int i, j, row = 4;
		for (i = 0; i < row; i++) {
			for (j = row - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

//     *
//    **
//   ***
//  ****