public class GrupoPessoa {
	public static void main(String[] args) {
		Pessoas[] pessoas = { new Pessoas("Maria", 25), new Pessoas("João", 31), new Pessoas("Ana", 19),
				new Pessoas("Pedro", 42), new Pessoas("Juliana", 38) };

		CalculaIdade calcularIdade = new CalculaIdade();
		calcularIdade.calcularPessoas(pessoas);
	}
}
