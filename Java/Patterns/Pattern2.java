// package com.cdac_java.java;

public class Pattern2 {

	public static void main(String[] args) {
		int n = 4; // Change 'n' to adjust the height of the pattern

		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			// Print numbers
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(i+" ");
			}

			// Move to the next line
			System.out.println();
		}
	}
}

//       1 
//     2 2 2
//   3 3 3 3 3
// 4 4 4 4 4 4 4