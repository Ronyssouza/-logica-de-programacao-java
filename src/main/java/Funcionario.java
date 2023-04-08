
public class Funcionario {

	String nome;
	double salario;
	int tempoDeServico;
	double calcularAumento;
	double novoSalario;
	

	public Funcionario(String nome, double salario, int tempoDeServico) {

		this.nome = nome;
		this.salario = salario;
		this.tempoDeServico = tempoDeServico;
		

	}

	public double calcularAumento() {
		double novoSalario=salario;

		if (tempoDeServico <= 8) {
			salario *= 1.1;
			

		} else if (tempoDeServico > 10) {
			novoSalario *= 1.15;
		}
		return novoSalario;
	}
	
	
	

	public void imprimirInformacoes() {
		double novoSalario = calcularAumento();
		System.out.printf("Nome: %s - Salario: R$ %.2f - Tempo de servico: %d anos - Novo Salario: R$ %.2f\n", nome, salario, tempoDeServico, novoSalario );
	}
}


