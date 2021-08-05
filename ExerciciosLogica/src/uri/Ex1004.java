package uri;

import java.util.Scanner;

public class Ex1004 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int a, b, mult;
		a = teclado.nextInt();
		b = teclado.nextInt();
		mult = a * b;
		
		System.out.println("PROD = " + mult);
		teclado.close();

	}

}
