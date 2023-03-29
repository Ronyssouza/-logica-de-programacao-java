
public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double calcularValorTotalEmEstoque() {
       return preco * quantidade;
    }

    public void adicionarUnidades(int quantidadeAdicional) {
        quantidade = quantidade + quantidadeAdicional;
    }

    public void removeUniades(int quantidadeRemovida) {
        quantidade = quantidade - quantidadeRemovida;
    }
}