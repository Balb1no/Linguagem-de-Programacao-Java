package la�os_de_repeti��o;

public class Exerc�cio_01 {

	public static void main(String[] args) {
		
		int contador, divisao;
		for(contador = 1000; contador <=1999; contador++) {
			divisao = contador % 11;
			if (divisao == 5) {
				System.out.println(contador);
			}
			
		}
		
	}
 
}
