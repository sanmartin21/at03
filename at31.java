import java.util.Scanner;

public class at31 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int alto = 0;
		int baixo = 0;
		int numalto = 0;
		int numbaixo = 0;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Insira o número do aluno: ");
			int num = input.nextInt();
			System.out.println("Insira a altura do aluno: ");
			int alt = input.nextInt();
			
			if( i == 1) {
				alto = alt;
				numalto = num;
				baixo = alt;
				numbaixo = num;
			}	
			else {
				if(alt < baixo) {
					baixo = alt;
					numbaixo = num;
				}else if(alt > alto) {
					alto = alt;
					numalto = num;
				}
			}
		}
		
		System.out.println("Número do aluno mais alto: " + numalto);
		System.out.println("O aluno mais altos possuí: " + alto + "centímetros.");
		System.out.println("Número do aluno mais baixo: " + numbaixo);
		System.out.println("O aluno mais altos possuí: " + baixo + "centímetros.");
		input.close();	
	}

}



