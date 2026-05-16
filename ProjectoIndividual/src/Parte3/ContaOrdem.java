package Parte3;

public class ContaOrdem extends ContaBancaria implements SaldoReal  {

	private String regimeDeTitularidade;
	private double valorDeposito;

	public ContaOrdem(int numero, String titular, double saldo, String regimeDeTitularidade, double valorDeposito) {
		super(numero, titular, saldo);
		this.regimeDeTitularidade = regimeDeTitularidade;
		this.valorDeposito = valorDeposito;
	}

	public double deposito(double valor) {

		return saldo += valor - (valor * 0.01);
	}

	public double calculaSaldoReal(double valor) {
		return saldo + (valor * 1/100);
	}

	public String getRegimeDeTitularidade() {
		return regimeDeTitularidade;
	}

	public void setRegimeDeTitularidade(String regimeDeTitularidade) {
		this.regimeDeTitularidade = regimeDeTitularidade;
	}

	public double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	
}
