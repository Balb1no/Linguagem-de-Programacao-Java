package orientação_a_objetos;

import java.util.Scanner;

public class PatineteTeste {

	public static void main(String[] args) {
    Patinete novoPatinete = new Patinete();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o fabricante do patinete: ");
		novoPatinete.setFabricante(leia.next());
		
		System.out.println("Digite o modelo do patinete: ");
		novoPatinete.setModelo(leia.next());
		
		System.out.println("Digite a cor do patinete: ");
		novoPatinete.setCor(leia.next());
		System.out.println();
		
		System.out.println("Fabricante: " + novoPatinete.getFabricante());
		System.out.println("Modelo: " + novoPatinete.getModelo());
		System.out.println("Ano: " + novoPatinete.getCor());
		System.out.println();
		
	    novoPatinete.remando();
	    novoPatinete.freia();
		leia.close();

	}

}
