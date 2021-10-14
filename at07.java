

import java.util.Scanner;

public class at07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número inteiro");
		int primeiro = input.nextInt();
		System.out.println("Insira o segundo número inteiro");
		final int MAX = input.nextInt();
		
		
		for(int i = primeiro +1; i < MAX ; i++) { 
			System.out.print(i + "|");
		}
		
		input.close();
	}

}
