
public class ContaOrdem extends ContaBancaria {

	private String regimeDeTitularidade;

	
	
	public ContaOrdem(int numero, String titular, double saldo, String regimeDeTitularidade) {
		super(numero, titular, saldo);
		this.regimeDeTitularidade = regimeDeTitularidade;

	}

	public double deposito(double valor) {

		return saldo += valor - (valor * 0.01);
	}

	public double saldoReal(double valor) {
		return saldo + (valor * 1) / 100;
	}

	public String getRegimeDeTitularidade() {
		return regimeDeTitularidade;
	}

	public void setRegimeDeTitularidade(String regimeDeTitularidade) {
		this.regimeDeTitularidade = regimeDeTitularidade;
	}

}
