package testRef;

import model.Conta;

public class TestaMetodo  {
	public static void main(String[] args) {
		Conta contaLucas = new Conta();
		contaLucas.saldo = 100.00;
		contaLucas.depositar(80);
		System.out.println(contaLucas.saldo);

		boolean conseguiuRetirar =  contaLucas.sacar(20.00);
		System.out.println(contaLucas.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta 	contaMatheus = new Conta();
		contaMatheus.depositar(100.00);
		
		contaMatheus.trasferencia(50.00, contaLucas);
		
		System.out.println("1 " + contaLucas.saldo);
		System.out.println("2" + contaMatheus.saldo);
		contaMatheus.titular = "Matheus";
		System.out.println(contaMatheus.titular);
	
	}

}
