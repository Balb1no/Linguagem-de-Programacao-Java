package collections;

import java.util.Scanner;
import java.util.ArrayList;
public class testeLoja {
	public static void main(String[] args) throws InterruptedException {
		Scanner leia = new Scanner(System.in);
		ArrayList<loja> estoque = new ArrayList<>();
		int contador;
		String nomeLoja, resposta;
		
		System.out.print("\nQual o nome da loja? ");
		nomeLoja = leia.nextLine();
		
		System.out.print("Qual a quantidade de produtos que você irá levar? ");
		contador = leia.nextInt();
		
		System.out.println("\n\n===Gerenciamento de estoque da loja "+nomeLoja+"===");
		
		for(int inicio=0;inicio<contador;inicio++) {
			System.out.print("Digite o produto em estoque: ");
			String item = leia.next();
			
			System.out.print("Digite a quantidade desse produto em estoque: ");
			int quantidadeItem = leia.nextInt();
			
			estoque.add(new loja (item , quantidadeItem));
			
		}
		
		System.out.println("\n\n===Estoque da loja  " + nomeLoja + "===");
		for(int inicio = 0; inicio < estoque.size(); inicio++) {
			System.out.println((inicio+1) + "º " + estoque.get(inicio));
		}
		
		System.out.println("\nDeseja remover algum produto da sua lista de compras? [Sim/Não]");
		resposta=leia.next();
		while(resposta.equals("Sim")||resposta.equals("sim")||resposta.equals("SIM")
				||resposta.equals("Não")||resposta.equals("NÃO")||resposta.equals("não")) {
			if (resposta.equals("Sim")||resposta.equals("sim")||resposta.equals("SIM")) {
				System.out.println("Qual a posição do(s) produto(s) que desejaria remover? [Apenas o número, exemplo: 8]");
				int numeroRemover = leia.nextInt();
				estoque.remove(numeroRemover-1);
				System.out.println("\n\n===Estoque atualizado da loja " + nomeLoja + "===");
				for(int inicio = 0; inicio < estoque.size(); inicio++) {
					System.out.println((inicio+1) + "º " + estoque.get(inicio));
				}
				System.out.println("\nDeseja remover outro produto?");
				resposta=leia.next();
			}
			else if (resposta.equals("Não")||resposta.equals("NÃO")||resposta.equals("não")) {
				System.out.println("\nOk, muito obrigado por usar nosso programa!");
				Thread.sleep(2000);
				System.out.println("Programa finalizado!");
				break;
			}
		}
		leia.close();
	}
}	