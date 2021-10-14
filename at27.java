import java.util.Scanner;

public class at27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int i = 0;
		float valortotal = 0;
		float troco = 0;
		float produto = 1;


		while (produto != 0) {
			System.out.println("Insira o valor do produto: \nObs:O valor zero deve ser informado pelo operador para indicar o final da compra!");
			produto = input.nextFloat();
			++i;
			System.out.println("Lojas Tabajara");
			System.out.println("Produto" + i + ": - R$" + produto);
			valortotal = (valortotal + produto);
		}
		System.out.println("Total: R$ " + valortotal);
		System.out.println("Insira o valor em dinheiro:");
		double money = input.nextDouble();
		System.out.println("Dinheiro: R$ " + money);
		troco = (float) (money - valortotal);
		System.out.println("Troco: R$ " + troco);

		input.close();

	}
}