public class GerenciadorDePessoas {
    public static void main(String[] args) {
        Pessoa[] pessoas = {
                new Pessoa("Maria", 25),
                new Pessoa("João", 31),
                new Pessoa("Ana", 19),
                new Pessoa("Pedro", 42),
                new Pessoa("Juliana", 38) };

        GrupoPessoas grupo = new GrupoPessoas(pessoas);

        Pessoa pessoaMaisVelha = grupo.pessoaMaisVelha();
        Pessoa pessoaMaisNova = grupo.pessoaMaisNova();

        System.out.println("Média de idade: " + grupo.idadeMedia());
        System.out.println("Pessoa mais velha: " + pessoaMaisVelha.getNome());
        System.out.println("Pessoa mais nova: " + pessoaMaisNova.getNome());
    }
}
