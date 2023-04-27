
public class Mecanico {

	// João cobra R$ 50,00 pelo serviço de troca de óleo e R$ 20,00 pela verificação
	// de cada pneu.
	
	

	private double precoTrocaDeOleo = 50.0;
	private double precoVerificacaoPneu = 20.0;
	private double litrosAdicionais = 2.5;
	private double polegadaAdicionais= 5.0;

	public double calcularCusto(Carro carro) {

		double custoTrocaDeOleo = precoTrocaDeOleo * litrosAdicionais;
		if (carro.getLitroDeOleo() > 4) {

			double litrosAdicionais = carro.getLitroDeOleo();
			custoTrocaDeOleo += litrosAdicionais;
		}
		double custoVerificacaoPneu = precoVerificacaoPneu * polegadaAdicionais;
		if (carro.getTamanhoDoPneu() < 16) {

			double polegadaAdicionais = carro.getTamanhoDoPneu() - 16;
			custoVerificacaoPneu += polegadaAdicionais;
		}

		double custoTotal = custoTrocaDeOleo + custoVerificacaoPneu * litrosAdicionais + polegadaAdicionais;
		return custoTotal;
	}

}
