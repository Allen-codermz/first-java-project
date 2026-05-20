
package Parte3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GestaoDeContas_2  {

	public static void imprimirContas(ContaBancaria c, double valor, double valor1) {
		System.out.println("Numero da conta: " + c.getNumero() + "\n Saldo: " + c.getSaldo() + "\nSaldo real: "
				+ c.saldoReal(valor+valor1));

	}

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
			System.out.println("Conta a ordem criada com sucesso!!! ");
			System.out.println("");
			ContaOrdem co = new ContaOrdem(num, titular, 0, regime);
			
			ContaBancaria conta1 = co;
			System.out.println("Faca mais um depositio: ");
			double valor1 = input.nextDouble();
			conta1.deposito(valor1);
			System.out.println("Segundo deposito efectuado com sucesso na sua conta!");
			System.out.println(" ");
	
			co.deposito(valor);

			imprimirContas(co, valor, valor1);

			// cadatro da conta a prazo
			System.out.println(" ");
			System.out.println("===CONTA A PRAZO===");
			System.out.println("Digite o numero da conta:");
			int num1 = input.nextInt();
			input.nextLine();

			System.out.println("Digite o titular:");
			String titular1 = input.nextLine();
			System.out.println("Digite o valor que deseja depositar: ");
			double valor2 = input.nextDouble();
			System.out.println("Conta a prazo criada com sucesso!!! ");
			System.out.println("");

			ContaPrazo cp = new ContaPrazo(num1, titular1, 0);
			
			ContaBancaria conta2 = cp;
			System.out.println("Faca mais um depositio: ");
			double valor3 = input.nextDouble();
			
			conta2.deposito(valor1);
			System.out.println("Segundo deposito efectuado com sucesso na sua conta!");
			System.out.println(" ");
			
			cp.deposito(valor2);
			
			imprimirContas(cp, valor2,valor3);

		} catch (ValidacaoDeRegimeExecption e) {
			System.out.println(e.getMessage());
			input.nextLine();
		}catch (InputMismatchException e) {
			System.out.println("Dado Invalida. Por favor, verifique a opcao e tente novamente");
		}
		input.close();
	}

}
