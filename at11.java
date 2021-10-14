

import java.util.Scanner;

public class at11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = 0; int impar = 0; int par = 0;
		

		for (int x = 0; x < 10; x++) {
			System.out.println("Insira um número inteiro:");
			num = input.nextInt();
			if (num % 2 != 0) {
				impar = impar +1;
			} else
				par = par +1;
		}
		System.out.println("Impares:" + impar);
		System.out.println("Pares:" + par);
		
		input.close();
	}
}
