package uri;

import java.util.Scanner;

public class Ex1005 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
			double nota1, nota2, media;
			nota1 = teclado.nextDouble();
			nota2 = teclado.nextDouble();
			media = (nota1 + nota2)/2;
			
		
	
			System.out.printf("MEDIA = %.5f", media);
			teclado.close();
		

	}

}
