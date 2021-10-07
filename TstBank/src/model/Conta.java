package model;

public class Conta {
	public double saldo;
	public Long numero;
	public Long agencia;
	public String titular;
	
    public void depositar(double valor) { 
    	this.saldo += valor;
    }
    
   public  boolean sacar(double valor ) {
	   if(this.saldo >= valor) {
		   this.saldo -= valor;
		   return true;
	  }else {
		  return false;
	  }
	   
	  }
   
   public boolean trasferencia(double valor, Conta destino) {
	   if(saldo >= valor ) {
		   this.saldo -= valor;
		   destino.depositar(valor);
		   return true;
	   }
	   return false;
   }

}
