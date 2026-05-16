package Parte3;

public class ContaPrazo extends ContaBancaria implements SaldoReal {

	private double valorDeposito;

	public ContaPrazo(int numero, String titular, double saldo, double valorDeposito1) {
		super(numero, titular, saldo);
		this.valorDeposito = valorDeposito;
	}

	public double deposito(double valor) {

		return saldo += valor + (valor * 0.03);
	}

	public double calculaSaldoReal(double valor) {
		return saldo - (valor * 3 / 100);
	}

	public double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

}
