import java.util.Scanner;

public class at28 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int quantidadetemp = 0;
		int i = 0;
		float tempe = 0;
		float maior = 0;
		float menor = 0;
		float soma = 0;
		float media = 0;

		System.out.println("Informe a quantidade de temperaturas que serão inseridas? ");
		quantidadetemp = input.nextInt();

		for (i = 0; i < quantidadetemp; i++) {
			System.out.println("Insira a temperatura:");
			tempe = input.nextFloat();

			if (i == 0) {
				maior = tempe;
				menor = tempe;
				soma = soma + tempe;
			} else {
				if (tempe > maior) {
					maior = tempe;
					soma = soma + tempe;
				} else {
					menor = tempe;
					soma = soma + tempe;
				}
			}
		}
		media = soma / i;

		System.out.println("A menor temperatura informada é: " + menor);
		System.out.println("A maior temperatura informada é: " + maior);
		System.out.println("A média das temperaturas informadas foi: " + media);

		input.close();
	}

}
