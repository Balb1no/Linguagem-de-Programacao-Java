package la�o_de_decis�o;

import java.util.Scanner;

public class Exerc�cio_04 {

	public static void main(String[] args) {
				
		double numero, raiz, quadrado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		numero = leia.nextDouble();
		
		raiz = Math.sqrt(numero);
		
		quadrado = Math.pow(numero,2);
		
		if (numero % 2 == 0) {
			System.out.println("O " + numero + " � par, a raiz quadrada � " + raiz);
		
		}
		else if (numero % 2 != 0) {
			System.out.println("O " + numero + " � �mpar, elevado ao quadrado � " + quadrado);
			leia.close();
		}
		
		
		
	
		
		

	}

}
