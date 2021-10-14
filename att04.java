

import java.util.Scanner;

public class att04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Insira a população do país A:");
		double paisa = input.nextDouble();
		System.out.println("Insira a população do país B:");
		double paisb = input.nextDouble();
		System.out.println("Insira a taxa de crescimento do país A:");
		double cresca = input.nextDouble();
		System.out.println("Insira a taxa de crescimento do país B:");
		double crescb = input.nextDouble();
		
		int anos = 0;
		cresca = cresca/100;
		crescb = crescb/100;
		
		while (paisa <= paisb) {
			paisa = paisa + (paisa * cresca);
			paisb = paisb + (paisb * crescb);
			anos++;
		}
		System.out.println("Após" + " " + anos + " " + "anos, país A ultrapassou o país B em número de habitantes");

		input.close();
	}
	}
