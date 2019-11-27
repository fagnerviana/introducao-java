package enteties;

public class FuncionarioList {
	
	
	private int id;
	private String nome;
	private Double salario;
	
	
	
	
	public void AumentoSalario(double tx) {
		tx = salario*tx/100;
		this.salario +=tx;
		
	}
	
	public FuncionarioList(int id,String nome, double salario) {
		this.id = id;
		this.nome=nome;
		this.salario=salario;
			
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome=nome;
		
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario (double salario) {
		this.salario= salario;
	}

}
