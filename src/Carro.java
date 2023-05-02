
public class Carro {
	String marca, modelo;
	Proprietario proprietario;
	Placa placa;
	Motor motor;
	
	Carro(String novoMarca, String novoModelo, Proprietario novoProprietario, Placa novaPlaca, Motor novoMotor){
		this.marca = novoMarca;
		this.modelo = novoModelo;
		this.proprietario = novoProprietario;
		this.placa = novaPlaca;
		this.motor = novoMotor;
		
	}
	
	public String getDescricao() {
		return ("Carro " + this.marca+ "/" + this.modelo + "."+this.proprietario.getDescricao() + this.placa.getDescricao()+this.motor.getDescricao());
	}

}
