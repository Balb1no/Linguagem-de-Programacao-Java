package polimorfismo;

public interface animal_01 {
	
	default void emitirSom() {
		System.out.println("O animal est� emitindo um som: ");
		
	}

}
