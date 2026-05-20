package Parte3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GestaoDeContas_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			// cadastro da conta a ordem
			System.out.println("===CONTA A ORDEM===");
			System.out.println("Digite o numero da conta:");
			int num = input.nextInt();
			input.nextLine();
			System.out.println("Digite o titular:");
			String titular = input.nextLine();

			System.out.println("Digite o regime de Titularidade: ");
			String regime = input.next();
			if (!regime.equalsIgnoreCase("Individual") && !regime.equalsIgnoreCase("Conjunta")
					&& !regime.equalsIgnoreCase("Solidaria") && !regime.equalsIgnoreCase("Mista")) {
				throw new ValidacaoDeRegimeExecption("Regime de titularidade invalido!!");
			}

			System.out.println("Digite o valor que deseja depositar: ");
			double valor = input.nextDouble();
			System.out.println(" ");

			ContaOrdem co = new ContaOrdem(num, titular, 0, regime);
			co.deposito(valor);

			// exibicao dos dados da conta a ordem
			System.out.println("===DADOS DA CONTA A ORDEM===");
			System.out.println("Numero da conta: " + co.getNumero());
			System.out.println("O titular: " + co.getTitular());
			System.out.println("Saldo: " + co.getSaldo());
			System.out.println("Regime de titularidade: " + co.getRegimeDeTitularidade());
			System.out.println("Conta a ordem criada com sucesso!!");
			System.out.println(" ");

			ContaBancaria conta1 = co;
			System.out.println("Faca mais um depositio: ");
			double valor1 = input.nextDouble();
			conta1.deposito(valor1);
			System.out.println("Segundo deposito efectuado com sucesso na sua conta!");
			System.out.println("Saldo: " + co.getSaldo());
			System.out.println("Saldo Real: " + co.saldoReal(valor+valor1));
			System.out.println(" ");

			// Criacao da conta a prazo
			System.out.println("===CONTA A PRAZO===");
			System.out.println("Digite o numero da conta:");
			int num1 = input.nextInt();
			input.nextLine();

			System.out.println("Digite o titular:");
			String titular1 = input.nextLine();

			System.out.println("Digite o valor que deseja depositar: ");
			double valor2 = input.nextDouble();
			System.out.println(" ");

			ContaPrazo cp = new ContaPrazo(num1, titular1, 0);
			cp.deposito(valor2);
			System.out.println("===DADOS DA CONTA A PRAZO===");
			System.out.println(" ");
			System.out.println("Numero da conta: " + cp.getNumero());
			System.out.println("Titular: " + cp.getTitular());
			System.out.println("Saldo: " + cp.getSaldo());
			System.out.println("Conta a prazo criada com sucesso!!");

			ContaBancaria conta2 = cp;
			System.out.println("Faca mais um depositio: ");
			double valor3 = input.nextDouble();
			conta2.deposito(valor3);
			System.out.println("Segundo deposito efectuado com sucesso na sua conta!");
			System.out.println("Saldo: " + cp.getSaldo());
			System.out.println("Saldo Real: " + cp.saldoReal(valor2+valor3));
			System.out.println(" ");

		} catch (ValidacaoDeRegimeExecption e) {
			System.out.println(e.getMessage());
			input.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Dado Invalida. Por favor, verifique a opcao e tente novamente");
		}
		input.close();
	}	}

