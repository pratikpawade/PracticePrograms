// package com.cdac_java.java;

public class Pattern {

	public static void main(String[] args) {
		
		int n = 4; 
		
      //for rows
		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// Print "*"
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			// Move to the next line
			System.out.println();
		}
	}
}

//     *
//    ***
//   *****
//  *******
