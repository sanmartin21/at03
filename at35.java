import java.util.Scanner;

public class at35 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double cachorroquente = 1.20;
		double baurusimples = 1.30;
		double baurucomovo = 1.50;
		double hamburguer = 1.20;
		double cheeseburguer = 1.30;
		double refrigerante = 1;
		double totalitens = 0;
		double compratotal = 0;

		while (true) {
			System.out.println("Insira o código do item: \nCaso queira encerrar o programa insira o número 0!");
			int codigo = input.nextInt();
			System.out.println(
					"Insira a quantidade desejada do produto: \nCaso queira encerrar o programa insira o número 0 novamente!");
			int quant = input.nextInt();

			if (codigo == 100) {
				totalitens = quant * cachorroquente;
				compratotal = compratotal + totalitens;
				System.out.println("Código 100: R$ " + totalitens);
			}
			if (codigo == 101) {
				totalitens = quant * baurusimples;
				compratotal = compratotal + totalitens;
				System.out.println("Código 101: R$ " + totalitens);
			}
			if (codigo == 102) {
				totalitens = quant * baurucomovo;
				compratotal = compratotal + totalitens;
				System.out.println("Código 102: R$ " + totalitens);
			}
			if (codigo == 103) {
				totalitens = quant * hamburguer;
				compratotal = compratotal + totalitens;
				System.out.println("Código 103: R$ " + totalitens);
			}
			if (codigo == 104) {
				totalitens = quant * cheeseburguer;
				compratotal = compratotal + totalitens;
				System.out.println("Código 104: R$ " + totalitens);
			}
			if (codigo == 105) {
				totalitens = quant * refrigerante;
				compratotal = compratotal + totalitens;
				System.out.println("Código 105: R$ " + totalitens);
			}
			if (codigo == 0) {
				System.out.println("Programa encerrado. A compra foi finalizada!");
				break;
			}

		}
		System.out.println("Total geral do pedido: R$" + compratotal);

		input.close();
	}

}