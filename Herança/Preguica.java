package heran�a;

public class Preguica extends Animal{
	private String nome;
	private int idade;
	
	void subir() {
		System.out.println("A pregui�a est� subindo na �rvore...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
