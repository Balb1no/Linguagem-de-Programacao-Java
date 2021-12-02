package orientação_a_objetos;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
    Funcionario novoFuncionario = new Funcionario();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		novoFuncionario.setNome(leia.next());
		
		System.out.println("Digite a sexo: ");
		novoFuncionario.setSexo(leia.next());
		
		System.out.println("Digite a idade do funcionário: ");
		novoFuncionario.setIdade(leia.nextInt());
		System.out.println();
		
		System.out.println("Nome: " + novoFuncionario.getNome());
		System.out.println("Sexo: " + novoFuncionario.getSexo());
		System.out.println("Idade: " + novoFuncionario.getIdade());
		System.out.println();
		
	    novoFuncionario.trabalhando();
	    novoFuncionario.comendo();
	    novoFuncionario.reclamando();
		leia.close();

	}

}
