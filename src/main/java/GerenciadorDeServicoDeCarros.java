
public class GerenciadorDeServicoDeCarros {

	public static void main(String[] args) {

		// criar 3 modelo de carros com suas observação de oleo e pneu (entrada )

		// calcular o custo total de cada carro (Processamento)

		// imprimir o resultado (saida)
		// carro e um tipo Carro da classe que estamos criando

		Carro carro1 = new Carro("Fiat", 4, 15); // CTRL depois do new Navega para class carro
		Carro carro2 = new Carro("Volkswagem", 5, 14);
		Carro carro3 = new Carro("FORD", 6, 16); // modo debug as
		Carro carro4 = new Carro("Cadillac", 5, 19);
		Carro carro5 = new Carro("Jaguar", 9, 20);
		Carro carro6 = new Carro("Roewe RX8", 8, 21);

		Mecanico mecanico = new Mecanico();

		double custoTotalCarro1 = mecanico.calcularCusto(carro1);
		double custoTotalCarro2 = mecanico.calcularCusto(carro2);
		double custoTotalCarro3 = mecanico.calcularCusto(carro3);
		double custoTotalCarro4 = mecanico.calcularCusto(carro4);
		double custoTotalCarro5 = mecanico.calcularCusto(carro5);
		double custoTotalCarro6 = mecanico.calcularCusto(carro6);
		
		System.out.printf("Custo total do servico do %s: R$ %.2f\n", carro1.getModelo(), custoTotalCarro1);
		System.out.printf("Custo total do Servico do %s: R$ %.2f\n", carro2.getModelo(), custoTotalCarro2);
		System.out.printf("Custo total do Servico do %s: R$ %.2f\n", carro3.getModelo(), custoTotalCarro3);
		System.out.printf("Custo total do Servico do %s: R$ %.2f\n", carro4.getModelo(), custoTotalCarro4);
		System.out.printf("Custo total do Servico do %s: R$ %.2f\n", carro5.getModelo(), custoTotalCarro5);
		System.out.printf("Custo total do Servico do %s: R$ %.2f\n", carro6.getModelo(), custoTotalCarro6);
	}
}
