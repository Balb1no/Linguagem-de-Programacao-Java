package heran�a;

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
		
		System.out.println("O nome do cachorro � " + novoDog.getNome() + ".");
		System.out.println("A idade do cachorro � " + novoDog.getIdade() + ".");
		
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
		
		System.out.println("O nome do cavalo � " + novoHorse.getNome() + ".");
		System.out.println("A idade do cavalo � " + novoHorse.getIdade() + ".");
		
		System.out.println();
		
		novoHorse.anda();
		novoHorse.corre();
		novoHorse.come();
		novoHorse.dorme();
		novoHorse.som();
		
		System.out.println();
		
		System.out.println("Digite o nome da Pregui�a: ");
		novaPreg.getNome();
		
		System.out.println("Digite a idade da Pregui�a: ");
		novaPreg.getIdade();
		
		System.out.println();
		
		System.out.println("O nome da pregui�a � " + novaPreg.getNome() + ".");
		System.out.println("A idade da pregui�a � " + novaPreg.getIdade() + ".");
		
		System.out.println();
		
		novaPreg.anda();
		novaPreg.corre();
		novaPreg.come();
		novaPreg.dorme();
		novaPreg.som();
		leia.close();
	}

}
