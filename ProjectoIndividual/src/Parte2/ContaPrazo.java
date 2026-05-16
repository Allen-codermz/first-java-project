package Parte2;

public class ContaPrazo extends ContaBancaria {

	private double valorDeposito;
	
	public double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

	public ContaPrazo(int numero, String titular, double saldo, double valorDeposito1) {
		super(numero, titular, saldo);

	}

	public double deposito(double valor) {

		return saldo += valor + (valor * 0.03);
	}
	public double saldoReal(double valor) {
		return saldo - (valor * 3/100);
	}

}
