
package Parte2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GestaoDeContas_2 {

	public static void imprimirContas(ContaBancaria c, double valor) {
		System.out.println("Numero da conta: " + c.getNumero());

		System.out.println("Saldo: " + c.getSaldo());

		System.out.println("Saldo real: " + c.saldoReal(valor));
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
			co.deposito(valorDeposito);
			
			
			imprimirContas(co, valorDeposito);

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
			cp.deposito(valorDeposito1);


			imprimirContas(cp, valorDeposito);
		} catch (InputMismatchException e) {
			System.out.println("Opcao Invalida. Por favor, verifique a opcao e tente novamente");
		}
	}

}
