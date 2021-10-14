

import java.util.Scanner;

public class at24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double total = 0;
		double media = 0;

		System.out.println("Qual é a quantidade de CD's que a coleção possuí?");
		int cd = input.nextInt();

		for (int i = 1; i <= cd; i++) {
			System.out.println("Qual é a quantidade média gasta por esse CD?");
			double gasto = input.nextDouble();

			total = total + gasto;
		}
		media = (double) (total / cd);
		System.out.println("Qual é a quantidade média gasta por CD?");
		System.out.println("O valor total investido foi:" + total);
		System.out.println("O valor médio investido por CD foi:" + media);

		input.close();
	}

}
