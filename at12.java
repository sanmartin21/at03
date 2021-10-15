

import java.util.Scanner;

public class at12 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int num = 1; int num2 = 0;
		System.out.println("Insira o n−ésimo termo:");
		int n = input.nextInt();
		
		System.out.println(num2);
		System.out.println(num);
		
		for (int i = 0; i <= n; i++) {
			num = num + num2;
            num2 = num - num2;
            System.out.println(num);
		}
		input.close();
	}
}
	
