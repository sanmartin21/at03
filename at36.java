import java.util.Scanner;

public class at36 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		int candidato4 = 0;
		int nulos5 = 0;
		int brancos6 = 0;
		float contador = 0;

		System.out.println("Digite 0 - Para finalizar o conjunto de votos");
		System.out.println("1 - Jose;");
		System.out.println("2 - Joao;");
		System.out.println("3 - Robson;");
		System.out.println("4 - Carina;");
		System.out.println("5 - Voto nulo;");
		System.out.println("6 - Voto em branco;");

		while (true) {
			System.out.println("Digite seu voto:");
			int voto = input.nextInt();

			if (voto == 0)
				break;
			if (voto == 1) {
				candidato1++;
				contador++;
			}
			if (voto == 2) {
				candidato2++;
				contador++;
			}
			if (voto == 3) {
				candidato3++;
				contador++;
			}
			if (voto == 4) {
				candidato4++;
				contador++;
			}
			if (voto == 5) {
				nulos5++;
				contador++;
			}
			if (voto == 6) {
				brancos6++;
				contador++;
			}
		}

		System.out.println("O total de votos para cada candidato foi: ");
		System.out.println("Jose = " + candidato1);
		System.out.println("Joao = " + candidato2);
		System.out.println("Robson = " + candidato3);
		System.out.println("Carina = " + candidato4);
		System.out.println("O total de votos nulos foi: " + nulos5);
		System.out.println("O total de votos em branco: " + brancos6);
		double percentualvnulo = ((nulos5 * 100) / contador);
		double percentualvbranco = ((brancos6 * 100) / contador);
		System.out.println("A percentagem de votos nulos sobre o total de votos foi: " + percentualvnulo);
		System.out.println("A percentagem de votos em branco sobre o total de votos foi: " + percentualvbranco);
		System.out.println("O conjunto total de votos foi: " + contador);
	}

}