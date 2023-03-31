
public class CalculaIdade {
	
	public void calcularPessoas(Pessoas[] pessoas) {
		Pessoas minhaPessoa = new Pessoas(null, 0); 
		
		int somaIdades = 0;
		int maiorIdade = pessoas[0].getIdade();
		int menorIdade = pessoas[0].getIdade();
		String nomeMaisVelho = pessoas[0].getNome();
		String nomeMaisNovo = pessoas[0].getNome();

		for (Pessoas pessoa : pessoas) {
			somaIdades += pessoa.getIdade();

			if (pessoa.getIdade() > maiorIdade) {
				maiorIdade = pessoa.getIdade();
				nomeMaisVelho = pessoa.getNome();
			}

			if (pessoa.getIdade() < menorIdade) {
				menorIdade = pessoa.getIdade();
				nomeMaisNovo = pessoa.getNome();
			}
		}

		double mediaIdade = (double) somaIdades / pessoas.length;

		System.out.println("Media de idade: " + mediaIdade);
		System.out.println("Pessoa mais velha: " + nomeMaisVelho);
		System.out.println("Pessoa mais nova: " + nomeMaisNovo);
	}
}

