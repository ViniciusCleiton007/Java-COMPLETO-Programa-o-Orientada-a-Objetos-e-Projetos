package entities;

public class Banco {

	private int numero;
	private String titular;
	private double saldo;

	public Banco(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	public Banco(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return  titular;
	}
	
	public void setNomeConta(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double dinheiro) {
		saldo += dinheiro;
	}
	
	public void saque(double dinheiro) {
		saldo -= dinheiro + 5.0;
	}
	
	public  String toString() {
		return "Conta: " + numero + ","
				+ "Titular: " + titular + "," 
				+ "Deposito: $" + String.format("%.2f", saldo);
	}

}
