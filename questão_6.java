package lista3;

import java.util.Scanner;

public class questão_6 {

	public static void main(String[] args) {
		/*
		 * 6 - Faça um programa que solicita ao usuário dois valores inteiros e
		 * positivos que serão a base e o expoente. O programa deve calcular e escrever
		 * o resultado da base elevado à potência utilizando estrutura de repetição.
		 */
		Scanner ler = new Scanner(System.in);
		int i = 1, exp, base, result = 1;

		// O código vai se repetir ate que sejam digitados 2 números positivos

		do {
			System.out.println("Insira a Base:");
			base = ler.nextInt();

			System.out.println("Insira o Expoente:");
			exp = ler.nextInt();

			if (base < 0 || exp < 0) {
				System.out.printf("%nUm dos números inseridos é negativo%n");
				System.out.println("Por favor insira apenas números positivos");
				System.out.println("--------------------------------------------------");
			} else {

				do {
					result = (base * result);
					i++;
				} while (i <= exp);
				System.out.printf("%d^%d = %d %n", base, exp, result);
			}

		} while (i == 1);
	}

}
