package polimorfismo;

public interface animal_01 {
	
	default void emitirSom() {
		System.out.println("O animal está emitindo um som: ");
		
	}

}
