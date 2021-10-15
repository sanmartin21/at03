import java.util.Scanner;

public class at33 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		double div;
		int juros;
		int parcela1 = 1;
		int parcela2 = 3;
		int parcela3 = 6;
		int parcela4 = 9;
		int parcela5 = 12;
		double valor1, valor2, valor3, valor4, valor5;
		double juros1, juros2, juros3, juros4, juros5;
		
		System.out.println("Informe o valor da dívida: ");
		div = input.nextDouble();
		
		juros1 = 0;
		juros2 = ((div/100)*10);
		juros3 = ((div/100)*15);
		juros4 = ((div/100)*20);	
		juros5 = ((div/100)*25);
		
		valor1 = (div+juros1)/1;
		valor2 = (div+juros2)/3;
		valor3 = (div+juros3)/6;
		valor4 = (div+juros4)/9;
		valor5 = (div+juros5)/12;
		
		System.out.println("Valor da dívida    Valor dos Juros   Quantidade de parcelas     Valor da parcela");
		
		for(int i = 1; i <= 5; i++) {
			if( i == 1) 
				System.out.println("R$ " + (div+juros1) + "   ----------------  " + juros1 + " ---------------- " + parcela1 + " ---------------- R$ " + valor1);
			else if(i == 2)
				System.out.println("R$ " + (div+juros2) + " ----------------  " + juros2 + " ---------------- " + parcela2 + " ---------------- R$ " + valor2);
			else if(i == 3)
				System.out.println("R$ " + (div+juros3) + " ----------------  " + juros3 + " ---------------- " + parcela3 + " ---------------- R$ " + valor3);
			else if(i == 4)
				System.out.println("R$ " + (div+juros4) + " ----------------  " + juros4 + " ---------------- " + parcela4 + " ---------------- R$ " + valor4);
			else if(i == 5)
				System.out.println("R$ " + (div+juros5) + " ----------------  " + juros5 + " ---------------- " + parcela5 + " ---------------- R$ " + valor5);
		}
			
		input.close();
			 
	}

}


	