package DoubtsWebinar.Web1_Feb28;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = 2 * n - 1;
		int nsp = 0;
		while (row <= n) {

			// work to be done in every row
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}

			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				cst = cst + 1;
			}

			// prep for next row
			System.out.println();
			nst = nst - 2;
			nsp = nsp + 1;
			row = row + 1;
		}

	}

}
