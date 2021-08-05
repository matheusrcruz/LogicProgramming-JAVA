package desafioProgramador;

import java.util.Scanner;

public class Public {




	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner leitor = new Scanner(System.in);
	int positivo=0;



	for(int i=0;i<6;i++){
	int x = leitor.nextInt();



	if(x>0){
	positivo++;
	}
	}



	System.out.println(positivo+" positivos" );

	}



}
