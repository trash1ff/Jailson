
public class Conta {
	int id;
	String tipo;
	String nome;
	double saldo;
	double deposito;
	double saque;
	
	public Conta(int id, String tipo, String nome, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	String getDescricao(){
		return "Conta tipo: " + this.tipo
				+ "| ID: " + this.id
				+ "| Cliente: " + this.nome
				+ "| Saldo: " +  this.saldo;
		
	}
	
	double getDeposito() {
		saldo = this.saldo + deposito;
		return this.saldo;
	}
	double getSaque() {
		saldo = saldo - saque;
		return saldo;
	}
			
}
