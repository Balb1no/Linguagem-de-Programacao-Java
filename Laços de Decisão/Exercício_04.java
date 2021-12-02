package laço_de_decisão;

import java.util.Scanner;

public class Exercício_04 {

	public static void main(String[] args) {
				
		double numero, raiz, quadrado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		numero = leia.nextDouble();
		
		raiz = Math.sqrt(numero);
		
		quadrado = Math.pow(numero,2);
		
		if (numero % 2 == 0) {
			System.out.println("O " + numero + " é par, a raiz quadrada é " + raiz);
		
		}
		else if (numero % 2 != 0) {
			System.out.println("O " + numero + " é ímpar, elevado ao quadrado é " + quadrado);
			leia.close();
		}
		
		
		
	
		
		

	}

}
