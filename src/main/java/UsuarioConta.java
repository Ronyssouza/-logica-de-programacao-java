public class UsuarioConta {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(12345, "João da Silva", 1000.0, 500.0);
		ContaBancaria conta2 = new ContaBancaria(67890, "Maria Souza", 500.0, 1000.0);
		ContaBancaria conta3 = new ContaBancaria(24680, "Jose Santos", 2000.0, 200.0);

		conta1.depositar(500.0);
		conta2.sacar(200.0);
		conta3.sacar(2200.0);

		if (!conta3.sacar(1000.0)) {
			System.out.println("Saldo insuficiente");
		}

		if (!conta3.sacar(100.0)) {
			System.out.println("");

			conta3.imprimirExtrato();
		}
	}

}
