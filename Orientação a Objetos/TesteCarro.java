package orientação_a_objetos;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {
	Carro novoCarro = new Carro();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o fabricante do carro: ");
		novoCarro.setFabricante(leia.next());
		
		System.out.println("Digite o modelo do carro: ");
		novoCarro.setModelo(leia.next());
		
		System.out.println("Digite o ano do carro: ");
		novoCarro.setAno(leia.nextInt());
		System.out.println();
		
		System.out.println("Fabricante: " + novoCarro.getFabricante());
		System.out.println("Modelo: " + novoCarro.getModelo());
		System.out.println("Ano: " + novoCarro.getAno());
		System.out.println();
		
	    novoCarro.liga();
	    novoCarro.acelera();
	    novoCarro.freia();
		leia.close();


	}

}
