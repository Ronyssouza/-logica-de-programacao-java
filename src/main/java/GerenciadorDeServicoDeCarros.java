
public class GerenciadorDeServicoDeCarros {

	public static void main(String[] args) {

		// criar 3 modelo de carros com suas observação de oleo e pneu (entrada )

		// calcular o custo total de cada carro (Processamento)

		// imprimir o resultado (saida)
		// carro e um tipo Carro da classe que estamos criando

		Carro carro1 = new Carro("Fiat", 15, 4); // CTRL depois do new Navega para class carro
		Carro carro2 = new Carro("Volkswagem", 14, 5);
		Carro carro3 = new Carro("FORD", 16, 7); // modo debug as

		Mecanico mecanico = new Mecanico();

		double custoTotalCarro1 = mecanico.calcularCusto(carro1);
		double custoTotalCarro2 = mecanico.calcularCusto(carro2);
		double custoTotalCarro3 = mecanico.calcularCusto(carro3);

		System.out.printf("Custo total do servico do %s: R$ %.2f\n", carro1.getModelo(), custoTotalCarro1);
		System.out.printf("Custo total do servico do %s: R$ %.2f\n", carro2.getModelo(), custoTotalCarro2);
		System.out.printf("Custo total do servico do %s: R$ %.2f\n", carro3.getModelo(), custoTotalCarro3);
	}
}
