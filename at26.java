import java.util.Scanner;

public class at26 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Insira Preço do pão:");
		double pao= input.nextDouble();
		int i = 0;
		double quantia;
		
		System.out.println("Preço do pão: " + pao);
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
	
		while(i>=0 && i<50) {
			++i;
			quantia=(i*pao);
			System.out.println(i + " - R$ " + quantia);
		}
		
		input.close();
	
	
	}

}
