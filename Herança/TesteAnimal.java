package herança;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro novoDog = new Cachorro();
		Cavalo novoHorse = new Cavalo();
		Preguica novaPreg = new Preguica();
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o nome do Cachorro: ");
		novoDog.setNome(leia.next());
		
		System.out.println("Digite o idade do Cachorro: ");
		novoDog.setIdade(leia.nextInt());
		
		System.out.println();
		
		System.out.println("O nome do cachorro é " + novoDog.getNome() + ".");
		System.out.println("A idade do cachorro é " + novoDog.getIdade() + ".");
		
		novoDog.anda();
		novoDog.corre();
		novoDog.come();
		novoDog.dorme();
		novoDog.som();
		
		System.out.println();
		
		System.out.println("Digite o nome do Cavalo: ");
		novoHorse.getNome();
		System.out.println("Digite a idade do Cavalo: ");
		novoHorse.getIdade();
		
		System.out.println();
		
		System.out.println("O nome do cavalo é " + novoHorse.getNome() + ".");
		System.out.println("A idade do cavalo é " + novoHorse.getIdade() + ".");
		
		System.out.println();
		
		novoHorse.anda();
		novoHorse.corre();
		novoHorse.come();
		novoHorse.dorme();
		novoHorse.som();
		
		System.out.println();
		
		System.out.println("Digite o nome da Preguiça: ");
		novaPreg.getNome();
		
		System.out.println("Digite a idade da Preguiça: ");
		novaPreg.getIdade();
		
		System.out.println();
		
		System.out.println("O nome da preguiça é " + novaPreg.getNome() + ".");
		System.out.println("A idade da preguiça é " + novaPreg.getIdade() + ".");
		
		System.out.println();
		
		novaPreg.anda();
		novaPreg.corre();
		novaPreg.come();
		novaPreg.dorme();
		novaPreg.som();
		leia.close();
	}

}
