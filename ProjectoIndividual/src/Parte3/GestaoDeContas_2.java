
package Parte3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GestaoDeContas_2 {

	public static void imprimirContas(SaldoReal c, double valor, ContaBancaria a) {
		System.out.println("Numero da conta: " + a.getNumero());

		System.out.println("Saldo: " + a.getSaldo());

		System.out.println("Saldo real: " + c.calculaSaldoReal(valor));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		try {

			System.out.println("===CONTA A ORDEM===");
			System.out.println("Digite o numero da conta:");
			int num = input.nextInt();
			input.nextLine();

			System.out.println("Digite o titular:");
			String titular = input.nextLine();

			System.out.println("Digite o regime de Titularidade: ");
			String regime = input.next();

			System.out.println("Digite o valor que deseja depositar: ");
			double valorDeposito = input.nextDouble();
			System.out.println(" ");

			ContaOrdem co = new ContaOrdem(num, titular, 0, regime, valorDeposito);
			SaldoReal real = co;
			co.deposito(valorDeposito);
			
			
			imprimirContas(co, valorDeposito, co);

			System.out.println(" ");
			System.out.println("===CONTA A PRAZO===");
			System.out.println("Digite o numero da conta:");
			int num1 = input.nextInt();
			input.nextLine();

			System.out.println("Digite o titular:");
			String titular1 = input.nextLine();

			System.out.println("Digite o valor que deseja depositar: ");
			double valorDeposito1 = input.nextDouble();
			System.out.println(" ");

			ContaPrazo cp = new ContaPrazo(num1, titular1, 0, valorDeposito1);
			SaldoReal real1 = cp;
			cp.deposito(valorDeposito1);


			imprimirContas(cp, valorDeposito, cp);
		} catch (InputMismatchException e) {
			System.out.println("Opcao Invalida. Por favor, verifique a opcao e tente novamente");
		}
	}

}
