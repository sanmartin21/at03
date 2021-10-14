import java.util.Scanner;

public class at29 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe a taboada desejada:");
		int tab = input.nextInt();

		System.out.println("Informe o valor inicial da taboada:");
		int vinicial = input.nextInt();
		System.out.println("Informe o valor final da taboada:");
		final int vfinal = input.nextInt();
		
		System.out.println("Montar a tabuada de: " + tab);
		System.out.println("Começar por: " + vinicial);
		System.out.println("Terminar em: " + vfinal);

		while (true) {
			if (vfinal > vinicial) {
				for (int i = vinicial; i <= vfinal; i++) {
					System.out.println(tab + " x " + i + " = " + (tab * i));
				}
				break;
			} else
				System.out.println("Usuário digitou o valor final menor que o valor inicial.");
			break;
		}
		
		input.close();
	}

}
