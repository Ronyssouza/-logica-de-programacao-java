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

	public void sacar(double valor) {
		if (valor > saldo && limiteCredito == 0) {
			System.out.println("Saldo insuficiente");
		} else if (valor > saldo + limiteCredito) {
			System.out.println("Limite de credito atingido");
		} else {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		}
	}

	public double consultarSaldo() {
		return saldo;
	}

	public double consultarLimite() {
		return limiteCredito;
	}

	public void imprimirExtrato() {
		System.out.println("Numero da conta: " + numeroConta);
		System.out.println("Nome do titular: " + nomeTitular);
		System.out.println("Saldo: R$ " +  saldo);
		System.out.println("Limite de credito: R$ " + limiteCredito);
	}
}
