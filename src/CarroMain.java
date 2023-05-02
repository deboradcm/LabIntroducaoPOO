
public class CarroMain {
	public static void main (String args[]) {
		
		Proprietario prop1 = new Proprietario();
		
		Proprietario prop2 = new Proprietario("Debora", 2345, 1984);
		System.out.println(prop2.getDescricao());
		System.out.println(prop1.getDescricao());
		System.out.println(prop1.getIdade(2023));
		
		Placa plaquinha = new Placa();
		System.out.println(plaquinha.getTipoString());
		System.out.println(plaquinha.getDescricao());
		
		Motor motorzinho = new Motor();
		System.out.println(motorzinho.getDescricao());
		System.out.println(motorzinho.getTipoString());
		
		Carro carrinho = new Carro("Delorean", "DMC-12",prop2, plaquinha, motorzinho);
		System.out.println(carrinho.getDescricao());
		
	}

}
