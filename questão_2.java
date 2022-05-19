package lista3;

public class questão_2 {

	public static void main(String[] args) {
		/*
		 * 2 - Faça um programa que exiba na tela a tabuada do número 5 no seguinte
		 * formato: 5X1=5; 5X2=10; 5X3=15; ... ; 5X10=50.
		 */

		for (int i = 1; i <= 10; i++) {
			System.out.printf("5x%d=%d %n", i, i * 5);
		}
		;

	}

}
