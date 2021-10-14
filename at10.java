

import java.util.Scanner;

public class at10 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor da base.");
		int base = input.nextInt();
		System.out.println("Insira o valor do expoente.");
		int expoente = input.nextInt();
		
		 for(int i=0 ; i < 1; i++){
			 double resultado = Math.pow (base,expoente);
			 System.out.println(resultado);
		    }
		 input.close();
	}

}
