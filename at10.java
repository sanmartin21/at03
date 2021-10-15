
import java.util.Scanner;

public class at10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor da base.");
		int base = input.nextInt();
		System.out.println("Insira o valor do expoente.");
		int expoente = input.nextInt();

		int resultado = 1;
		for (int i = 0; i < expoente; i++) {
			resultado *= base;
		}
		System.out.println("Resultado: " + resultado);

		input.close();
	}
}
