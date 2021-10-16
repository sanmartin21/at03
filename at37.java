import java.util.Scanner;

public class at37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float media;
		String[] respo = new String[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Resposta da questão " + (i + 1) + " :");
			respo[i] = input.nextLine();
		}

		System.out.println("--------");

		int contador = 1;
		int acertosmaior = 0;
		int menoresacerto = 0;
		float soma = 0;

		boolean x = true;
		while (x) {

			int acertos = 0;

			for (int i = 0; i < 10; i++) {

				System.out.println("Resposta da questão " + (i + 1) + ":");
				String r = input.nextLine();

				if (respo[i].equals(r)) {
					acertos++;
				} else {
					System.out.println(respo[i] + " é a resposta certa");
				}

			}
			System.out.println("Total de acertos: " + acertos);
			System.out.println("Nota = " + acertos);

			if (contador == 1) {
				acertosmaior = acertos;
				menoresacerto = acertos;
				soma = soma + acertos;
			} else {
				if (acertos < menoresacerto) {
					menoresacerto = acertos;
					soma = soma + acertos;
				} else if (acertos > acertosmaior) {
					acertosmaior = acertos;
					soma = soma + acertos;
				}
			}

			System.out.println("Outro aluno vai utilizar o sistema?(1 - sim; 2 - não)");
			int aluno = input.nextInt();

			input.nextLine();

			if (aluno == 1) {
				x = true;
				contador++;
			} else if (aluno == 2) {
				x = false;
			}

		}

		media = (soma / contador);

		System.out.println("O maior acerto foi: " + acertosmaior);
		System.out.println("o menor acerto foi: " + menoresacerto);
		System.out.println("Total de Alunos que utilizaram o sistema: " + contador);
		System.out.println("A Média das Notas da Turma foi: " + media);

	}
}
