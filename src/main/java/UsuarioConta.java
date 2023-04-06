public class UsuarioConta {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(12345, "João da Silva", 1000.0, 0);
		ContaBancaria conta2 = new ContaBancaria(67890, "Maria Souza", 500.0, 1000.0);
		ContaBancaria conta3 = new ContaBancaria(24680, "Jose Santos", 2000.0, 200.0);

		conta1.depositar(500.0);
		conta2.sacar(200.0);
		System.out.println("Extrato da conta3:" );
		conta3.imprimirExtrato();
		conta1.sacar(2000.0);
		conta3.sacar(2300.0);

//		conta1.sacar(1000.0);
//		System.out.println("Extrato da conta1:" );
//		conta1.imprimirExtrato();
//		conta1.sacar(1000.0);
//		conta1.sacar(500.0);
//		conta1.sacar(1.0);
//		System.out.println("Extrato da conta1:" );
//		conta1.imprimirExtrato();
	}
}
