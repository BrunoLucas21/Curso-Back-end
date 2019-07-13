
public class Conta {
	
	private String cliente;
	private int numero;
	private double saldo;
	private double deposito;
	private String agencia;
	private int numConta;
	
	public String getCliente() {
		return cliente;
		
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public int getNumero() {
		return numero;
		
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo=+ saldo;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
}