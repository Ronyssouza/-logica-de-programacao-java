public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	private double limiteCredito;

	public ContaBancaria(int numeroConta, String nomeTitular, double saldo, double limiteCredito) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
		this.limiteCredito = limiteCredito;

	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if (valor <= saldo + limiteCredito) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public double consultarSaldo() {
		return saldo;
	}

	public double consultarLimite() {
		return limiteCredito;
	}

	public void imprimirExtrato() {
		System.out.println("Extrato da conta3:" );
		System.out.println("Numero da conta: " + numeroConta);
		System.out.println("Nome do titular: " + nomeTitular);
		System.out.println("Saldo: R$ " +  saldo);
		System.out.println("Limite de credito: R$ " + limiteCredito);

		if (saldo < 0) {
			System.out.println("Limite de credito utilizado: R$ " + limiteCredito);
		} else {
			System.out.println("Saldo insuficiente");

		}

		if (saldo + limiteCredito >= 0) {
			System.out.println("Limite de credito atingido");
		}
	}
}
