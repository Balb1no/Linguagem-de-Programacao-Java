package la�os_de_repeti��o;

import java.util.Scanner;

public class Exerc�cio_05 {

	public static void main(String[] args) {
		
		int numero, soma = 0;
		
	Scanner leia = new Scanner (System.in);
	
	do {
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		soma+= numero;
		
	   }
	   while (numero != 0);
	   System.out.println("A soma dos n�meros digitados � " + soma);
	   leia.close();
	}

}
