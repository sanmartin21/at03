

import java.util.Scanner;

public class att04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Insira a popula��o do pa�s A:");
		double paisa = input.nextDouble();
		System.out.println("Insira a popula��o do pa�s B:");
		double paisb = input.nextDouble();
		System.out.println("Insira a taxa de crescimento do pa�s A:");
		double cresca = input.nextDouble();
		System.out.println("Insira a taxa de crescimento do pa�s B:");
		double crescb = input.nextDouble();
		
		int anos = 0;
		cresca = cresca/100;
		crescb = crescb/100;
		
		while (paisa <= paisb) {
			paisa = paisa + (paisa * cresca);
			paisb = paisb + (paisb * crescb);
			anos++;
		}
		System.out.println("Ap�s" + " " + anos + " " + "anos, pa�s A ultrapassou o pa�s B em n�mero de habitantes");

		input.close();
	}
	}
