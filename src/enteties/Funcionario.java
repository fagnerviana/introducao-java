package enteties;

public class Funcionario {
	
	public String nome;
	public double grossSalary;
	public double tax;
		
	public double netSalary() {
		return grossSalary -= tax;
		
	}
	
	public void increaseSalary(double percentage) {
		  
			grossSalary = grossSalary + ((grossSalary+tax)*percentage)/100; 
		
	}
	
	public String toString() {
		return "Updated Data: "+ nome +", $ "	+String.format("%.2f",grossSalary); 
		
	}
	

}
