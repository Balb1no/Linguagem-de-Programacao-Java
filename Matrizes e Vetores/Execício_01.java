package matrizes_e_vetores;

import java.util.Scanner;

public class Exec�cio_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int contagem = 0;
		double pontosmaiores = 0.0;
		double [] pontos = new double[5];
		for(contagem = 0; contagem < 5; contagem++) {
			System.out.println("Digite a " + (contagem + 1) + "� pontua��o: ");
			pontos[contagem] = leia.nextDouble();
			if (pontos[contagem] > pontosmaiores) {
				pontosmaiores = pontos[contagem];
				
			}
		}
		System.out.println("A maior pontua��o � de " + pontosmaiores + " pontos.");
		leia.close();

	}

}
