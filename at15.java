

import java.util.Scanner;

public class at15 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);

		int n1 = 38;
		int n2 = 39;
		int max = 0;
		float soma = 0;
		float expo = 0;

		for (max = 1; max <= 37; max++) {
			n1 = n1 - 1;
			n2 = n2 - 1;
			expo = ((n1 * n2) / max);
			soma = (soma + expo);
			System.out.print("(" + n1 + "x" + n2 + ")/" + max + " + ");
		}
		System.out.println("Soma final = " + soma);

		input.close();
	}
}