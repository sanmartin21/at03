import java.util.Scanner;

public class att37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Insira um número:");
		int numero = input.nextInt();
		int n1 = numero;
		int max = 10;
		int numfinal = 0;

		while (numero != 0) {
			numero %= max;
			numfinal += numero;
			numfinal *= 10;
			n1 -= numero;
			n1 /= 10;
			numero = n1;
		}

		numfinal /= 10;

		System.out.println("=> " + numfinal);
	}

}
