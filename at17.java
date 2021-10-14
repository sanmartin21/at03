

import java.util.Scanner;

public class at17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira um número inteiro:");
		int primo = input.nextInt();

		if ((primo % 2 == 0) && (primo != 2))
			System.out.println("Não é um número primo!");
		else if (primo == 1)
			System.out.println("Não é um número primo!");
		else 
			System.out.println("É um número primo!");
		input.close();
	}
}