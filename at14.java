

import java.util.Scanner;

public class at14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = 1;
		int n1 = 1;

		System.out.print("S = ");
		while (n <= 5) {
			System.out.print(n + " / " + n1 + " + ");
			n++;
			n1 += 2;
		}
		System.out.print(" ... + n/m");

		input.close();
	}
}