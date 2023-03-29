public class GerenciamentoEstoque {
	public static void main(String[] args) {
		Produto produto = new Produto(1, "Smartphone", 10, 1500.00);
		double valorTotal = produto.calcularValorTotalEmEstoque();
		System.out.printf("Valor total em estoque do produto %s: R$ %.2f%n", produto.getNome(), valorTotal);
		produto.adicionarUnidades(5);
		valorTotal = produto.calcularValorTotalEmEstoque();
		System.out.printf("Valor total em estoque do produto %s após adição de unidades: R$ %.2f%n", produto.getNome(), valorTotal);
		produto.removeUniades(3);
		valorTotal = produto.calcularValorTotalEmEstoque();
		System.out.printf("Valor total em estoque do produto %s após remoção de unidades: R$ %.2f%n", produto.getNome(), valorTotal);
	}
}