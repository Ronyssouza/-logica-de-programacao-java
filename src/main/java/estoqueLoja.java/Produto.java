package estoqueLoja.java;

import java.util.Locale;
import java.util.Scanner;
import Produto.java;

public class Produto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println(": ");
		System.out.print("Nome: ");
		
		Produto.nome= sc.nextLine();
		System.out.print("Preco: ");
		
		Produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		
		Produto.quantidade = sc.nextInt();
		System.out.println();
		System.out.println("Produto data: " + Produto);
		System.out.println();
		
		System.out.print("digite o produto  para add no estoque : ");
		int quantidade = sc.nextInt();
		Produto.addProduto(quantidade);
		System.out.println();
		System.out.println("data: " + produto);
		System.out.println();
		System.out.print("digite o produto a ser removido para ser removido do estoque: ");
		quantidade = sc.nextInt();
		Produto.removeProduto(quantidade);
		System.out.println();
		System.out.println("*********: " + Produto);
		sc.close();
	}
}