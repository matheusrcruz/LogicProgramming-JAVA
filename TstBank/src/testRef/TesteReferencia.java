package testRef;

import model.Conta;

public class TesteReferencia {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300.0;
		
		System.out.println("Saldo primeira Conta " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Segunda Conta " + segundaConta.saldo);
		
		segundaConta.saldo += 100.0;
		
		System.out.println("Segunda Conta " + segundaConta.saldo);
		
		System.out.println("Saldo primeira Conta " + primeiraConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
		
		
		
		
	}

}
