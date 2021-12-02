package laço_de_decisão;

import java.util.Scanner;


public class Exercício_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, c1=0, c2=0, c3=0;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
			c3=n1;
		}
		else if (n2 > n1 && n2 > n3) {
			c3=n3;
		}
		else if (n3 > n1 && n3 > n2) {
			c3=n3;
		}
		
		if ((n1 > n2 && n1 < n3)||(n1 > n3 && n1 < n2)); {
				c2=n1;
	    }
		if ((n2 > n1 && n2 < n3)||(n2 > n3 && n2 < n1)); {
				c2=n2;
		}
	    if ((n3 > n2 && n3 < n1)||(n3 > n1 && n3 < n2)); {
				c2=n3;
	    }
		if (n1 < n2 && n1 < n3) {
			c1=n1;
		}
		else if (n2 > n1 && n2 < n3) {
			 	c1=n2;
		}
		else if (n3 > n1 && n3 < n2) {
				c1=n3;
	    }
		System.out.println(c1 + ", " + c2 + ", " + c3);
		leia.close();
				
			
     		
		}

}
