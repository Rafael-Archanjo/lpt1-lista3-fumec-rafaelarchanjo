package lista3;

public class questão_5 {

	public static void main(String[] args) {
		/*
		 * 5- Faça um programa que exiba na tela a soma dos números inteiros do
		 * intervalo [100, 200].
		 */
		int x = 0;

		for (int i = 100; i <= 200; i++) {
			x = i + x;
		}
		;
		System.out.printf("A soma dos números entre 100 e 200 é igual a %d", x);
	}

}
