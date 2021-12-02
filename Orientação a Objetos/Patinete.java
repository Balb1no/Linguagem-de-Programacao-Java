package orientação_a_objetos;

public class Patinete {
	private String fabricante;
	private String modelo;
	private String cor;
	
	void remando( ) {
		System.out.println("O patinete está acelerando...");
	}
	void freia( ) {
		System.out.println("O patine está freiando...");
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
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
	
}
