
public class Proprietario {
	
	String nome;
	int cnh, anoNascimento;
	
	Proprietario(){
		nome="Emmett L. Brown";
		cnh=98008173;
		anoNascimento=1920;
	}
	
	Proprietario(String nome, int cnh, int anoNascimento){
		this.nome = nome;
		this.cnh = cnh;
		this.anoNascimento = anoNascimento;
	
	}
	
	public int getIdade(int anoReferencia) {
		return (anoReferencia - this.anoNascimento);
	}
	public String getDescricao() {
		return ("Proprietario: nome="+this.nome+", cnh="+this.cnh+", anoNascimento="+this.anoNascimento+".");
		
		
	}
	
	
	
	
	

}
