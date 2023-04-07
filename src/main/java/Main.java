public class Main {
	public static void main(String[] args) {
		Funcionario[] funcionarios = {

				new Funcionario("joao", 2000, 4), new Funcionario("maria", 3000, 8),
				new Funcionario("Pedro", 4000, 12), };

		for (Funcionario funcionario : funcionarios) {
			funcionario.calcularAumento();
			funcionario.imprimirInformacoes();
		}
	}

}