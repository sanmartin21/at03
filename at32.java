import java.util.Scanner;

public class at32 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		int codicidade;
		int cidade = 0;
		int maiorcidade = 0;
		int menorcidade =0;
		int cidmenosveiculos = 0;
		float quanttotal = 0;
		float quantmenosveiculos = 0;
		float quantveiculos = 0;
		float quantacidentes = 0;
		float maioracidentes = 0;
		float menoracidentes = 999;  
		float menormedia = 0;
		
		while(cidade<5) {
			System.out.println("Insira o código da cidade: ");
				 codicidade = input .nextInt();
			System.out.println("Insira a quantidade de veiculos de passeios no ano de 1999: ");
			 	quantveiculos = input .nextInt();
			 System.out.println("Insira a quantidade de acidentes de transito com vítimas no ano de 1999: ");
			 	quantacidentes=input .nextFloat();
		
			 	cidade++;
			 	quanttotal=quantveiculos+quanttotal;
		
		if (quantacidentes<menoracidentes) {
			menorcidade = codicidade;
			menoracidentes=quantacidentes; 	
		}
		
		if (quantacidentes>maioracidentes) {
			maiorcidade = codicidade;
			maioracidentes=quantacidentes; 	
		}
				
		if (quantveiculos<2000) {
			quantmenosveiculos=quantveiculos+quantmenosveiculos;
			cidmenosveiculos++;
			menormedia= (quantmenosveiculos/cidmenosveiculos);
		}
		
	}
		System.out.println("A cidade com a maior quantidade de acidentes foi a : " + maiorcidade);
		System.out.println("O número de acidentes foi : " + maioracidentes);
		System.out.println("A cidade com a menor quantidade de acidentes foi a : " + menorcidade);
		System.out.println("O número de acidentes foi : " + menoracidentes);
		System.out.println("A média de veículos nas cinco cidades juntas é: " + (quanttotal/cidade));
		System.out.println("A média de acidentes nas cidades com menos de 2000 veículos de passeios é: " + menormedia);

		input .close();
	}
}

