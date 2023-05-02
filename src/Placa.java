
public class Placa {
	String placa;
	int tipo;
	String tipos;
	boolean estacionamento;
	
	Placa(){
		placa = "OAT-3966";
		tipo = 6;
		
		if (tipo==1) {
			tipos = "Normal";
			estacionamento=false;
		} else if (tipo == 2){
			tipos = "Serviço";
			estacionamento=true;
		} else if (tipo == 3){
			tipos = "Oficial";
			estacionamento=true;
		} else if (tipo == 4){
			tipos = "Auto Escola";
			estacionamento=false;
		} else if (tipo == 5){
			tipos = "Prototipo";
			estacionamento=false;
		} else if (tipo == 6){
			tipos = "Colecionador";
			estacionamento=false;
		} else if (tipo > 6){
			tipos = "Outros";
			estacionamento=false;
		}   
	}
	
	Placa(String placa, int tipo){
		this.placa=placa;
		this.tipo=tipo;
		
		if (tipo==1) {
			tipos = "Normal";
			estacionamento=false;
		} else if (tipo == 2){
			tipos = "Serviço";
			estacionamento=true;
		} else if (tipo == 3){
			tipos = "Oficial";
			estacionamento=true;
		} else if (tipo == 4){
			tipos = "Auto Escola";
			estacionamento=false;
		} else if (tipo == 5){
			tipos = "Prototipo";
			estacionamento=false;
		} else if (tipo == 6){
			tipos = "Colecionador";
			estacionamento=false;
		} else if (tipo > 6){
			tipos = "Outros";
			estacionamento=false;
		}   
		
	}
	public String getTipoString() {
		return this.tipos;
	}
	
	public boolean temEstacionamentoLivre() {
		return this.estacionamento;
	}
	
	public String getDescricao() {
		return ("Placa: placa=" + this.placa+ ", tipo=" + this.tipos + ", estacionamentoLivre="+this.estacionamento + ".");
	}

}
