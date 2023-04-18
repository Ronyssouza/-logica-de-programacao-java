
public class Mecanico {

	//João cobra R$ 50,00 pelo serviço de troca de óleo e R$ 20,00 pela verificação de cada pneu.
	
		private double precoTrocaDeOleo = 50.0;
		private double precoVerificacaoPneu = 20.0;
		
	
	
		
		public double  calcularCusto (Carro carro) {
				
			double custoTotal = precoTrocaDeOleo + precoVerificacaoPneu * carro.getTamanhoDoPneu();
	
			return custoTotal;
		} 

		

}
