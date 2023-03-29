import java.util.Scanner;

public class mediaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja adicionar? ");
        int n = sc.nextInt();

        String nomeMaisVelho = "", nomeMaisNovo = "";
        int idadeMaisVelho = 0, idadeMaisNovo = 0;
        int somaIdades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite o nome da %d pessoa: ", i);
            String nome = sc.next();

            System.out.printf("Digite a idade da %d pessoa: ", i);
            int idade = sc.nextInt();

            if (i == 1) {
                nomeMaisVelho = nome;
                nomeMaisNovo = nome;
                idadeMaisVelho = idade;
                idadeMaisNovo = idade;
            } else {
                if (idade > idadeMaisVelho) {
                    nomeMaisVelho = nome;
                    idadeMaisVelho = idade;
                }
                if (idade < idadeMaisNovo) {
                    nomeMaisNovo = nome;
                    idadeMaisNovo = idade;
                }
            }

            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / n;

        System.out.printf("Media de idade: %.0f\n", mediaIdades);
        System.out.printf("Pessoa mais velha: %s\n", nomeMaisVelho);
        System.out.printf("Pessoa mais nova: %s\n", nomeMaisNovo);

        sc.close();
    }
}
