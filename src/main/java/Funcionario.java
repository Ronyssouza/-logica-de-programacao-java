
public class Funcionario {

	String nome;
	double salario;
	int tempoDeServico;
	double calcularAumento;
	

	public Funcionario(String nome, double salario, int tempoDeServico) {

		this.nome = nome;
		this.salario = salario;
		this.tempoDeServico = tempoDeServico;
		

	}

	public double calcularAumento() {

		if (tempoDeServico > 5 && tempoDeServico < 10) {
			salario *= 1.1;

		} else if (tempoDeServico > 10) {
			salario *= 1.15;
		}
		return salario;
	}
	
	
	

	public void imprimirInformacoes() {
		System.out.printf("Nome: %s - Salario: R$ %.2f - Tempo de servico: %d anos - Novo Salario: R$ %.2f\n", nome, salario, tempoDeServico, salario );
	}
}


