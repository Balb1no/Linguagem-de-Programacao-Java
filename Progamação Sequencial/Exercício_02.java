package programação_sequencial;

import java.util.Scanner;

public class Exercício_02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeDias, totalDias;
		
	 System.out.println("Digite quantos dias você já viveu: ");
	 totalDias = leia.nextInt();
	 
	 idadeAnos = totalDias/365;
	 
	 idadeMeses = (totalDias%365) / 30; 
	 
	 idadeDias = (totalDias%365) % 30;
	 
	 System.out.println("A idade é: "  + idadeAnos);
	 System.out.println("Meses: " + idadeMeses);
	 System.out.println("Dias: " + idadeDias);
	 
	 leia.close();
	 
	}

}
