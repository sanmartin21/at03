

import java.util.Scanner;

public class at19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int primo = 0;
		int divisivel = 0;

		System.out.println("Insira um número inteiro:");
		int inteiro = input.nextInt();

		for (int i = 1; i <= inteiro; i++) {
			if ((i % 2 == 1) && (i != 2) || (i == 2)) {
				System.out.print(i + " | ");
				divisivel++;
			} else {
				divisivel++;
			}
		}
		System.out.println("\nO número de divisões executadas foi: " + divisivel);
		input.close();

		}

	}