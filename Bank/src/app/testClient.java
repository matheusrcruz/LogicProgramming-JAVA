package app;

import model.Cliente;
import model.Conta;

public class testClient {
	public static void main(String[] args) {
		Cliente matheus = new Cliente();
		
		matheus.setNome("Matheus");
		matheus.setCpf("7777777");
		matheus.setProfissao("Programador");
		Conta contaDoMatheus = new Conta();
		
		contaDoMatheus.setTitular(matheus);
		
		System.out.println(contaDoMatheus.getTitular().getNome());
		System.out.println(contaDoMatheus.getTitular().getCpf());
		System.out.println(contaDoMatheus.getTitular().getProfissao());
		
		/*	
		contaDoMatheus.titular = matheus;
		System.out.println(contaDoMatheus.titular);
		System.out.println(contaDoMatheus.titular.nome);
		System.out.println(matheus);
		*/
		
	}

}
