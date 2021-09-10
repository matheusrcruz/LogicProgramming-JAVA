package app;

import model.Conta;

public class CriarContas {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200.00;
		
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Primeira Conta " + primeiraConta.saldo);
		
		Conta segundaConta  = new Conta();
		
		segundaConta.saldo = (double) 50;
		
		System.out.println("Segunda Conta " + segundaConta.saldo);
		System.out.println(primeiraConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("sao iguais");
		}
		else {
			System.out.println("Não são iguais");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
		
		
	}

}
