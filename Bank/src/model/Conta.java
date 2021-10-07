package model;

public class Conta {
	private double saldo;
	private Integer numero;
	private Long agencia;
	private Cliente titular;
	private static int total;

	public Conta() {
	}

	public Conta(long agencia, int numero) {
		super();
		Conta.total ++;
		System.out.println("Total de contas criadas � " + Conta.total);
		this.numero = numero;
		this.agencia = agencia;
		System.out.println("Conta criada "+ this.numero);

	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean trasferencia(double valor, Conta destino) {
		if (saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o aceitamos nulo");
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void setAgencia(Long agencia) {
		if (agencia <= 0) {
			System.out.println("N�o aceitamos numeros negativos ou zero para cria��o de conta");
			return;
		}
		this.agencia = agencia;
	}

	public Long getAgencia() {
		return agencia;
	}
	public static int getTotal() {
		return Conta.total;
	}

}
