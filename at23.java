

import java.util.Scanner;

public class at23 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		float soma = 0;
		float media = 0;
		
		
		System.out.println("Qual será a quantidade de turmas?");
		int turmas = input.nextInt();
		
		for(int i = 1; i <= turmas; i++) {
		System.out.println("Insira a quantidade de alunos?");
		int alunos = input.nextInt();
			while (alunos>40) {
				System.out.println("O número máximo de alunos aceito por turma são 40!");
				System.out.println("Insira a quantidade de alunos?");
				alunos = input.nextInt();
			}
			soma = soma + alunos;
			}
		media = soma/turmas;
		
		System.out.println("O número médio de alunos por turma será:" + media);
		
		input.close();
		}
		
}
