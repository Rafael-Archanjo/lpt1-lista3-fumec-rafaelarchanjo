package lista3;
import java.util.Scanner;

public class questão_9 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para uma calculadora simples que solicita ao usuário dois
		 * operandos como entrada, seleciona uma das opções da lista (1- soma, 2-
		 * produto, 3- divisão, 4- potência) e exibe o resultado. O algoritmo deve
		 * executar repetidamente até que os dois operandos informados sejam iguais a
		 * zero.
		 */
		Scanner ler = new Scanner(System.in);
		float result = 0, num1, num2;
		int x;

		do {
			System.out.println("Digite o 1º número");
			num1 = ler.nextInt();

			System.out.println("Digite o 2º número");
			num2 = ler.nextInt();
			if (num1 != 0 && num2 != 0) {
				System.out.printf(" 1 - Soma %n 2 - Produto %n 3 - Divisão %n 4 - Potência %n");
				System.out.println("Digite o tipo de conta que deseja fazer:");
				x = ler.nextInt();

				switch (x) {
				case 1:
					result = num1 + num2;
					System.out.printf("O resultado da soma é = %.2f %n", result);
					break;

				case 2:
					result = num1 * num2;
					System.out.printf("O produto da multiplicação é = %.2f %n", result);
					break;

				case 3:
					result = num1 / num2;
					System.out.printf("O resultado da divisão é = %.2f %n", result);
					break;

				case 4:
					result = (int) Math.pow(num1, num2);
					//for (int i = 1; i < num2; i++) { result = result * num1; }
					System.out.printf("O resultado da potência é = %.2f %n", result);
					break;

				default:
					System.out.printf("Item não encontrado");
				}

				System.out.println("-----------------------------------------------");

			}

		} while (num1 != 0 && num2 != 0);

	}

}
