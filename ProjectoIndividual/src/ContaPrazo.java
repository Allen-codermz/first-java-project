
public class ContaPrazo extends ContaBancaria {

		public ContaPrazo(int numero, String titular, double saldo) {
		super(numero, titular, saldo);

	}

	public double deposito(double valor) {

		return saldo += valor + (valor * 0.03);
	}
	public double saldoReal(double valor) {
		return saldo - (valor * 3)/100;
	}

}
