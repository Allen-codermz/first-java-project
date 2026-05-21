package Parte2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GestaoDeContas_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// cadastro da conta a ordem
				System.out.println("===CONTA A ORDEM===");
				int num = -1;
				while (num == -1) {
					try {
						System.out.println("Digite o numero da conta:");
						num = input.nextInt();
						input.nextLine();
					} catch (InputMismatchException e) {
						System.out.println("Dado Invalido. Por favor, verifique a opcao e tente novamente");
						input.nextLine();
					}
				}

				System.out.println("Digite o titular:");
				String titular = input.nextLine();

				String regime = "";
				while (true) {
					System.out.println("Digite o regime de Titularidade: ");
					regime = input.next();
					if (regime.equalsIgnoreCase("Individual") || regime.equalsIgnoreCase("Conjunta")
							|| regime.equalsIgnoreCase("Solidaria") || regime.equalsIgnoreCase("Mista")) {
						break;
					}
					System.out.println("Regime de titularidade invalido!! Tente novamente.");
				}

				double valor = -1;
				while (valor <= 0) {
					try {
						System.out.println("Digite o valor que deseja depositar: ");
						valor = input.nextDouble();
						if (valor <= 0) {
							System.out.println("Valor invalido!! O valor deve ser maior que zero");
						}
					} catch (InputMismatchException e) {
						System.out.println("Valor invalido!! Tente novamente");
						input.nextLine();
					}
				}

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
				double valor1 = -1;
				while (valor1 <= 0) {
					try {
						System.out.println("Faca mais um deposito:  ");
						valor1 = input.nextDouble();
						if (valor1 <= 0) {
							System.out.println("Valor invalido!! O valor deve ser maior que zero");
						}
					} catch (InputMismatchException e) {
						System.out.println("Valor invalido!! Tente novamente");
						input.nextLine();
					}
				}
				conta1.deposito(valor1);
				System.out.println("Segundo deposito efectuado com sucesso na sua conta!");
				System.out.println("Saldo: " + co.getSaldo());
				System.out.println("Saldo Real: " + co.saldoReal(valor + valor1));
				System.out.println(" ");

				// Criacao da conta a prazo
				System.out.println("===CONTA A PRAZO===");

				int num1 = -1;
				while (num1 == -1) {
					try {
						System.out.println("Digite o numero da conta:");
						num1 = input.nextInt();
						input.nextLine();
					} catch (InputMismatchException e) {
						System.out.println("Dado Invalido. Por favor, verifique a opcao e tente novamente");
						input.nextLine();
					}
				}

				System.out.println("Digite o titular:");
				String titular1 = input.nextLine();
				
				double valor2 = -1;
				while (valor2 <= 0) {
					try {
						System.out.println("Digite o valor que deseja depositar: ");
						valor2 = input.nextDouble();
						if (valor2 <= 0) {
							System.out.println("Valor invalido!! O valor deve ser maior que zero");
						}
					} catch (InputMismatchException e) {
						System.out.println("Valor invalido!! Tente novamente");
						input.nextLine();
					}
				}

				ContaPrazo cp = new ContaPrazo(num1, titular1, 0);
				cp.deposito(valor2);
				System.out.println("===DADOS DA CONTA A PRAZO===");
				System.out.println(" ");
				System.out.println("Numero da conta: " + cp.getNumero());
				System.out.println("Titular: " + cp.getTitular());
				System.out.println("Saldo: " + cp.getSaldo());
				System.out.println("Conta a prazo criada com sucesso!!");

				ContaBancaria conta2 = cp;
				double valor3 = -1;
				while (valor3 <= 0) {
					try {
						System.out.println("Faca mais um deposito: : ");
						valor3 = input.nextDouble();
						if (valor3 <= 0) {
							System.out.println("Valor invalido!! O valor deve ser maior que zero");
						}
					} catch (InputMismatchException e) {
						System.out.println("Valor invalido!! Tente novamente");
						input.nextLine();
					}
				}
				conta2.deposito(valor3);
				System.out.println("Segundo deposito efectuado com sucesso na sua conta!");
				System.out.println("Saldo: " + cp.getSaldo());
				System.out.println("Saldo Real: " + cp.saldoReal(valor2 + valor3));
				System.out.println(" ");

				input.close();

	}
}
