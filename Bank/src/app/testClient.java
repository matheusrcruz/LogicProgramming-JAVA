package app;

import model.Cliente;
import model.Conta;

public class testClient {
	public static void main(String[] args) {
		Cliente matheus = new Cliente();
		
		matheus.nome = "Matheus";
		matheus.cpf = "7777777";
		matheus.profissao = "Programador";
		
		Conta contaDoMatheus = new Conta();
		
		contaDoMatheus.titular = matheus;
		System.out.println(contaDoMatheus.titular);
		System.out.println(contaDoMatheus.titular.nome);
		System.out.println(matheus);
		
		
	}

}
