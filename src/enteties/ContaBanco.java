package enteties;

public class ContaBanco {
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public void saque(double saque) {
		
		this.saldo -= saque+5;
		}
	
    public void deposito(double deposito) {
		
    	this.saldo += deposito;
		
	}
    
    public double saldoConta() {
    	return saldo;
    	
    }
	
	public String toString() {
		
		return "Account data: "
		      + numeroConta
		      + " Holder: "+nome
		      + " Balance: $ " +String.format("%.2f", saldo);
		
	}
	
	public ContaBanco(int numeroConta, String nome, double iniciarDeposito) {
		
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(iniciarDeposito);
	}
	
	public ContaBanco(int numeroConta, String nome) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
