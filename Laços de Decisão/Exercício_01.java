package la�o_de_decis�o;

import java.util.Scanner;

public class Exerc�cio_01 {
	
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
			System.out.println("O primeiro n�mero " + numero1 + " � o maior.");
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O primeiro n�mero " + numero2 + " � o maior.");
		}
		else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("O primeiro n�mero " + numero3 + " � o maior.");
			
			leia.close();
		}
			
		
		
		
		
	}

}
