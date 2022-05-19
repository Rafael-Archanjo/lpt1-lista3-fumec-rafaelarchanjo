package lista3;

import java.util.Scanner;

public class questão_7 {

	public static void main(String[] args) {
		/*
		 * 7. Faça um programa que solicita ao usuário uma quantidade indeterminada de
		 * números inteiros. O programa deve calcular e escrever a média aritmética
		 * apenas dos números pares. A entrada de dados deve ser encerrada quando o
		 * número ZERO for digitado.
		 */
		Scanner ler = new Scanner(System.in);
		float num, cont = 0, total = 0;

		do {
			System.out.println("Insira um número:");
			num = ler.nextFloat();

			if (num % 2 == 0 && num != 0) {
				cont++;
				total = total + num;
			}
			;

		} while (num != 0);
		System.out.printf("A media dos numeros pares é de %.2f", (total / cont));
	}

}
