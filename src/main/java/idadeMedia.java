
/*A tarefa consiste em criar um programa que calcule a média de idade, 
 * encontre a pessoa mais velha e a pessoa mais nova de um grupo de pessoas. 
para isso, será necessário armazenar as informações de cada pessoa, como nome e idade, e criar um grupo de pessoas.

No final do programa, deve-se imprimir na tela a média de idade, o nome da pessoa mais velha e o nome da pessoa mais nova.*/


public class idadeMedia {

	public static void main(String[] args) {
		String [] nome = {"ronys", "gabriel", "Helena", "Pedro", "James"};
		int[] idade = {20, 25, 30, 35, 40}; 
	        
	        int soma = 0;
	        for (int i = 0; i < idade.length; i++) {
	            soma += idade[i];
	        }
	        
	        double media = (double) soma / idade.length;
	        
	        System.out.println(nome[0]+ " idade == " + idade[0]+"anos");
	        System.out.println(nome[1]+ " idade == " + idade[1]+"anos");
	        System.out.println(nome[2]+ " idade == " + idade[2]+"anos");
	        System.out.println(nome[3]+ " idade == " + idade[3]+"anos");
	        System.out.println(nome[4]+ " idade == " + idade[4]+"anos");
	        System.out.println();
	        System.out.println("a media de idad e " + media);
	    }
	}

