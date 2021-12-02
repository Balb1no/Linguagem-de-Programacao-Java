package laço_de_decisão;

import java.util.Scanner;

public class Exercício_01 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, numero3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o primeiro valor: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o primeiro valor: ");
		numero3 = leia.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O primeiro número " + numero1 + " é o maior.");
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O primeiro número " + numero2 + " é o maior.");
		}
		else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("O primeiro número " + numero3 + " é o maior.");
			
			leia.close();
		}
			
		
		
		
		
	}

}
