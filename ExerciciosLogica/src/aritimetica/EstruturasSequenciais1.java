package aritimetica;

import java.util.Scanner;

public class EstruturasSequenciais1 {

	public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
		
			int numero = 0;int outro = 0;int soma = 0;
			
			System.out.println("Digite um numero");
			numero = sc.nextInt();
			
			System.out.println("Digite outro numero");
			outro = sc.nextInt();
			soma = numero + outro;
			System.out.println("a soma � igual " + soma);
			
			sc.close();
			
			
			
		
	}

}
