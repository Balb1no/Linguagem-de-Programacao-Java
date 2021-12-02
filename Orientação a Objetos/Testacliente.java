package orientação_a_objetos;

public class Testacliente {

	public static void main(String[] args) {
		Cliente novoCliente = new Cliente();
		
		novoCliente.setNome("Gabriel");
		novoCliente.setCpf("324.234.123-32");
		novoCliente.setIdade(21);
		novoCliente.setCidade("Atibaia");
		novoCliente.setEstado("São Paulo");
		
		System.out.println(novoCliente.getNome());	
		System.out.println(novoCliente.getCpf());
		System.out.println(novoCliente.getIdade());
		System.out.println(novoCliente.getCidade());
		System.out.println(novoCliente.getEstado());
		
		novoCliente.compra();
		
		novoCliente.paga();
		
		novoCliente.come();

	}

}
