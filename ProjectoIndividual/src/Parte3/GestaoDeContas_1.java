package Parte3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GestaoDeContas_1 {

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

			ContaOrdem co = new ContaOrdem(num, titular, 0, regime,valorDeposito);
			co.deposito(valorDeposito);
			System.out.println("===DADOS DA CONTA A ORDEM===");
			System.out.println("Numero da conta: "+co.getNumero());
			System.out.println("O titular: "+co.getTitular());
			System.out.println("Saldo: "+ co.getSaldo());
			System.out.println("Regime de titularidade: " + co.getRegimeDeTitularidade());
			System.out.println("Conta a ordem criada com sucesso!!");
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
			System.out.println("===DADOS DA CONTA A PRAZO===");
			System.out.println(" ");
			System.out.println("Numero da conta: "+ cp.getNumero());
			System.out.println("Titular: "+ cp.getTitular());
			System.out.println("Saldo: "+ cp.getSaldo());
			System.out.println("Conta a prazo criada com sucesso!!");
			System.out.println(" ");

			// Aqui referenciamos as contas a super class
			ContaOrdem conta1 = co;
			ContaPrazo conta2 = cp;
			
			
			System.out.println("Foi efectuado um novo deposito de 1000 em todas as contas!");
			conta1.deposito(1000);
			conta2.deposito(1000);

			System.out.println("O novo saldo da sua conta a ordem é: " + conta1.getSaldo());
			System.out.println("O novo saldo da sua conta a prazo é: " + conta2.getSaldo());
		} catch (InputMismatchException e) {
			System.out.println("Opcao Invalida. Por favor, verifique a opcao e tente novamente");
		}

	}
}
