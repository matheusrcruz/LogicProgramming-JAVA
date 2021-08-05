package minutos;

import java.util.Locale;
import java.util.Scanner;

public class Minutos {
	public static void main(String[]args) {
	
	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		
		double conta = 50.0;
		sc.close();
		if(minutos > 100) {
			conta = conta + (minutos)*2.0;
		}
		System.out.println("valor da conta " + conta);
		sc.close();
	}
}