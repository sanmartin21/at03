

import java.util.Scanner;

public class at16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a quantia de n�meros do conjunto:");
		int conjunto = input.nextInt();

		int men = 0;
		int max = 0;

		for (int cont = 1; conjunto <= conjunto; cont++) {
			System.out.println("Insira o n�mero do conjunto:");
			int numconjunto = input.nextInt();
			if (cont == 1) {
				men = numconjunto;
				max = numconjunto;
			} else {
			}
			if (numconjunto >= men) {
				men = numconjunto;
			} else if (numconjunto <= men) {
				max = numconjunto;
			}
			int soma = men + max;
			System.out.println("Menor n�mero � = " + men);
			System.out.println("Maior n�mero � = " + max);
			System.out.println("A soma ser� = " + soma);

			input.close();
		}
	}

}
