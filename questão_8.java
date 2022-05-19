package lista3;

import java.util.Scanner;

public class questão_8 {

	public static void main(String[] args) {
		/*
		 * 8. Faça um programa que solicita ao usuário um número real positivo.
		 * Verifique se o número é realmente positivo, e em caso contrário solicite ao
		 * usuário digitar novamente (este processo pode se repetir inúmeras vezes e é
		 * chamado de consistência, pois garante que o número será válido após a entrada
		 * de dados).
		 */
		Scanner ler = new Scanner(System.in);
		int i = 0, num;

		do {
			System.out.println("insira um número positivo:");
			num = ler.nextInt();

			if (num > 0) {
				System.out.println("O número é positivo");
			} else if (num < 0) {
				System.out.println("O número é negativo");
			} else {
				System.out.println("O número digitado é neutro");
			}
			;

		} while (num < 1);

	}

}
