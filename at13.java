

import java.util.Scanner;

public class at13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int fatorial = 1;

		System.out.println("Insira o numéro: ");
		int n1 = input.nextInt();

		for (int i = 1; i <= n1; i++) {
			fatorial = fatorial * i;
		}
		System.out.println("Fatorial:" + fatorial);
		input.close();
	}
}