package orienta��o_a_objetos;

import java.util.Scanner;

public class TesteAviao {

	public static void main(String[] args) {
		Aviao novoAviao = new Aviao();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o fabricante do avi�o: ");
		novoAviao.setFabricante(leia.next());
		
		System.out.println("Digite o modelo do avi�o: ");
		novoAviao.setModelo(leia.next());
		
		System.out.println("Digite o ano do avi�o: ");
		novoAviao.setAno(leia.nextInt());
		System.out.println();
		
		System.out.println("Fabricante: " + novoAviao.getFabricante());
		System.out.println("Modelo: " + novoAviao.getModelo());
		System.out.println("Ano: " + novoAviao.getAno());
		System.out.println();
		
	    novoAviao.liga();
	    novoAviao.acelera();
	    novoAviao.decola();
		leia.close();

	}

}
