

import java.util.Scanner;

public class at03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String nome;
		int idade;
		float salario;
		char sexo, civil;

		while (true) {
			System.out.println("Informe um nome: ");
			nome = input.nextLine();
			if (nome.length() > 3) {
				System.out.println("Nome válido.");
				break;
			} else {
				System.out.println("O nome precisa ter mais que 3 caracteres.");
			}
		}

		while (true) {
			System.out.println("Informe uma idade entre 0 a 150: ");
			idade = input.nextInt();
			if ((idade > 0) && (idade <= 150)) {
				System.out.println("Idade válida.");
				break;
			} else {
				System.out.println("Idade precisa ser entre 0 a 150");
			}
		}

		while (true) {
			System.out.println("Informe um salário maior que 0: ");
			salario = input.nextFloat();
			if (salario > 0) {
				System.out.println("Salario válido.");
				break;
			} else {
			}
		}

		while (true) {
			System.out.println("Informe o sexo (f ou m): ");
			sexo = input.next().charAt(0);
			sexo = (Character.toString(sexo).toUpperCase()).charAt(0);
			if ((sexo == 'M') || (sexo == 'F')) {
				System.out.println("Sexo válido.");
				break;
			} else {
				System.out.println("O sexo precisa ser Feminino ou Masculino (f ou m)");
			}
		}

		while (true) {
			System.out.println("Informe um estado civil: soleiro (s), Casado(c), Viúvo (v), Divorciado (d): ");
			civil = input.next().charAt(0);
			civil = (Character.toString(civil).toUpperCase()).charAt(0);
			if (civil == 'S'|| civil == 'C' || civil == 'V' || civil == 'D') {
				System.out.println("O estado civil válido.");
				break;
			} else {
				System.out.println("O estado civil inválido.");
			}
		}
			input.close();
		}
	}
