

import java.util.Scanner;

public class at09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a taboada desejada.");
		
		int tab = input.nextInt();
		
		final int TAM = 10;
		
		for(int i = 1; i <= TAM; i++) { 
			int mult = tab * i;
		System.out.println(tab + " x " + i + " = " + (mult)) ;
		}
		input.close();
		
		}
	}