package heran�a;

public class Animal {
	private String nome;
	private int idade;
	
	
	void anda() {
		System.out.println("O animal est� andando...");
	}
	void corre() {
		System.out.println("O animal est� correndo...");
	}
	void come() {
		System.out.println("O animal est� comendo...");
	}
	void dorme() {
		System.out.println("O animal est� dormindo...");
	}
	void som() {
		System.out.println("O animal est� emitindo um som...");
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
