public class GrupoPessoas {

	private Pessoa[] pessoas;

	public GrupoPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}

	public int idadeMedia() {
		int somaIdades = 0;
		for (Pessoa pessoa: pessoas) {
			somaIdades = somaIdades + pessoa.getIdade();
		}

		return somaIdades / pessoas.length;
	}

	public Pessoa pessoaMaisVelha() {
		Pessoa pessoaMaisVelha = null;
		int idadeMaisVelha = 0;
		for (Pessoa pessoa: pessoas) {
			if (pessoa.getIdade() > idadeMaisVelha) {
				idadeMaisVelha = pessoa.getIdade();
				pessoaMaisVelha = pessoa;
			}
		}

		return pessoaMaisVelha;
	}

	public Pessoa pessoaMaisNova() {
		Pessoa pessoaMaisNova = null;
		int idadeMaisNova = 200;
		for (Pessoa pessoa: pessoas) {
			if (pessoa.getIdade() < idadeMaisNova) {
				idadeMaisNova = pessoa.getIdade();
				pessoaMaisNova = pessoa;
			}
		}

		return pessoaMaisNova;
	}
}
