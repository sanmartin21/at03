import java.util.Scanner;

public class at30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		int codialto = 0;
		int codibaixo = 0;
		int codigordo = 0;  
		int codimagro = 0;
		
		double omaisalto = Double.MIN_VALUE;
		double omaisbaixo = Double.MAX_VALUE;
		double gordo = Double.MIN_VALUE;
		double magro = Double.MAX_VALUE;
		
		double pesototal = 0;
		double alturatotal = 0;
		
		int i=0;
		while (true) {
		    System.out.print("Cliente, insira seu código: ");
		    int codicliente = input.nextInt();
		    if (codicliente == 0) 
		      	break;
		   
		    i++;	   
		    System.out.print("Insira sua altura: ");
		    double altura = input.nextDouble();
		    System.out.print("Insira seu peso: ");
		    double peso = input.nextDouble();
		    pesototal+=peso;
		    alturatotal+=altura;
		    
		    if (peso > gordo) {
		        codigordo = codicliente;
		        gordo = peso;
		    }
		    if (peso < magro) {
		        codimagro = codicliente;
		        magro = peso;
		    }
		    if (altura > omaisalto) {
		        codialto = codicliente;
		        omaisalto = altura;
		    }
		    if (altura < omaisbaixo) {
		        codibaixo = codicliente;
		        omaisbaixo = altura;
		    }
		   
		}
		
		System.out.println("O código do cliente mais alto é: " + codialto);
		System.out.println("O código do cliente mais baixo é: " + codibaixo);
		System.out.println("O código do cliente mais gordo é: " + codigordo);
		System.out.println("O código do cliente mais magro é : " + codimagro);
		System.out.println("A média da altura dos clientes é: " + (alturatotal/i));
		System.out.println("A média de peso dos clientes é: " + (pesototal/i));
	
		input.close();
	}

}

	
