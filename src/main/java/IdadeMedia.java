
/*A tarefa consiste em criar um programa que calcule a média de idade, 
 * encontre a pessoa mais velha e a pessoa mais nova de um grupo de pessoas. 
para isso, será necessário armazenar as informações de cada pessoa, como nome e idade, e criar um grupo de pessoas.

No final do programa, deve-se imprimir na tela a média de idade, o nome da pessoa mais velha e o nome da pessoa mais nova.*/


public class IdadeMedia {

	public static void main(String[] args) {
		String [] nomeAluno = {"ronys", "gabriel", "Helena", "Pedro", "James"};
		int[] idadeAluno = {20, 25, 30, 35, 40}; 
	        
	        int somaMedia = 0;
	        for (int i = 0; i < idadeAluno.length; i++) {
	            somaMedia += idadeAluno[i];
	        }
	        
	        double media = (double) somaMedia / idadeAluno.length;
	        
	        System.out.println(nomeAluno[0]+ " idade == " + idadeAluno[0] + "anos ");
	        System.out.println(nomeAluno[1]+ " idade == " + idadeAluno[1] + "anos ");
	        System.out.println(nomeAluno[2]+ " idade == " + idadeAluno[2] + "anos ");
	        System.out.println(nomeAluno[3]+ " idade == " + idadeAluno[3] + "anos ");
	        System.out.println(nomeAluno[4]+ " idade == " + idadeAluno[4] + "anos ");
	        System.out.println();
	        System.out.println("a media de idad e " + media);
	    }
	}

// camelCase --> para variaveis, atributos e metodos;
// PascalCase --> para classe enum e interfaces;
// SCREAMING_SNAKE_CASSE --> para constantes

