package semOop;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		
		System.out.println("Digite um lado do triangulo");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		System.out.println("Digite um lado do triangulo");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC)/2;
		double areaX = Math.sqrt(p * (p - xA)* (p - xB)* (p - xC));
			
		p = (yA + xB + yC)/2;
		double areaY = Math.sqrt(p * (p - yA)* (p - yB)* (p - yC));
		System.out.println("area do triangul x " + areaX);
		System.out.println("area do triangul y " + areaY);
		
		if (areaX > areaY)
			System.out.println(areaX);
		else System.out.println(areaY);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
