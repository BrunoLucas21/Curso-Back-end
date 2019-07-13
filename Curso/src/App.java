
public class App {

	public static void main(String[] args) {
		int i=(int) 3.9;
		double o=9;
		
		Conta c = new Conta();
		c.setCliente("Arnaldo");
		System.out.println(c.getCliente());
		
		c.setNumero(123456);
		System.out.println(c.getNumero());
		
		c.setSaldo(100.0);
		System.out.println(c.getSaldo());
		
		c.setDeposito(250.5);
		System.out.println(c.getDeposito());
		
		c.setAgencia("563");
		
		Banco banco= new Banco();
		banco.addConta(c);
		
		System.out.print(banco.buscarConta(123456).getAgencia());

	}
}
