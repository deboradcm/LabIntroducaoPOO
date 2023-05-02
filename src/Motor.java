
public class Motor {
	int tipo, potencia;
	double capacidade;
	
	
	Motor(){
		tipo = 1;
		potencia = 130;
		capacidade = 2.85;
		
	}
	
	Motor(int tipo, double capacidade, int potencia){
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.potencia=potencia;
		
		
	}
	
	public String getTipoString() {
		if (this.tipo==1) {
			return "Gasolina";
			
		} else if (this.tipo == 2){
			return "Alcool";
			
		} else if (this.tipo == 3){
			return "Flex";
			
		} else if (this.tipo == 4){
			return "Diesel";
			
		} else if (this.tipo == 5){
			return "Eletrico";
			
		}
		
		return "Outros";
			
		 
		
	}
	public String getDescricao() {
		return ("Motor: tipo=" + this.getTipoString() + ", capacidade=" + this.capacidade + "L, potencia=" + this.potencia + "CV.");
	}

}
