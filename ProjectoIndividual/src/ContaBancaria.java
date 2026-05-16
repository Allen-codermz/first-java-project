	
public class ContaBancaria {

	protected int numero;
	protected String titular;
	protected double saldo;

	public ContaBancaria() {
	}

	public ContaBancaria(int numero, String titular, double saldo) {

		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double deposito(double valor) {
		saldo += valor;
		return saldo;
	}
	
	public double saldoReal() {
		return saldo;
	}

	
}
