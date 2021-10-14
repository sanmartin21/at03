

import java.util.Scanner;

public class at20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float soma = 0;
		float media = 0;

		System.out.println("Insira a quantia de notas que será inserida: ");
		int cont = input.nextInt();
		for (int i = 1; i <= cont; i++) {
			System.out.println("Digite a nota:");
			float nota = input.nextInt();
			soma = soma + nota;
		}
		media = soma / cont;
		System.out.println("A média final será: " + media);

		input.close();
	}

}
