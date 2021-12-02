package matrizes_e_vetores;

public class Exercício_02 {

	public static void main(String[] args) {
	
		double[][] notasAlunos = new double[2][4];
		
		double soma = 0;
		
		notasAlunos[0][0] = 8.5;
		notasAlunos[0][1] = 9.6;
		notasAlunos[0][2] = 10.0;
		notasAlunos[0][3] = 5.3;
		notasAlunos[1][0] = 5.8;
		notasAlunos[1][1] = 6.9;
		notasAlunos[1][2] = 10.0;
		notasAlunos[1][3] = 3.5;
		
		for(int l = 0; l < notasAlunos.length;l++) {
			for(int c = 0; c < notasAlunos[1].length; c++) {
				soma+= notasAlunos[1][c];
				
			}
			System.out.println("Média: " + 1 + " é: " + (soma/4));
			
		}
				
	}

}
