package orientação_a_objetos;

public class Celular {
	private String Marca;
	private String modelo;
	private String cor;
	private int ano;
	
	void carrega( ) {
		System.out.println("O celular está carregando...");
	}
		
    void liga( ) {
		System.out.println("O celular está ligando...");
    }
    
	void desliga( ) {
		System.out.println("O celular está desligando...");
	
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
