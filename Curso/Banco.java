
public class Banco {

	private final static int TAM = 100;
	Conta[] contas = new Conta[TAM];
	private int pos;

	public void addConta(Conta conta) {
		 if(contas.length==pos) {
			Conta[] aux = new Conta[this.contas.length * 3];
			for (int i = 0; i < contas.length; i++) {
				aux[i] = contas[i];
			}
			this.contas = aux;


		}
		 
		 this.contas[pos]=conta;
		 pos++;

	}

	public Conta buscarConta(int numero) {

		Conta conta = null;

		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].getNumero() == numero) {

				conta = contas[i];

			}
		}

		return conta;
	}

	public void transferir(int numero, int outra, double valor) {
		for (int i = 0; i < this.contas.length; i++) {
			if (contas[i] != null && contas[i].getNumero() == outra) {
				double saldo = contas[i].getSaldo() + valor;

				contas[i].setSaldo(saldo);

			}

		}

	}
}
