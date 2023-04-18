
public class Carro { 	// --> acessivel em qualquer Lugar dentro ou fora do pacote
						// private --> menbro acessivel apenas dentro da classe em que está
						// Protected --> torna um membro acessivel dentro da classe que estar definido
						// em qualquer subclasse
						// default --> acessivel apenas dentro do mesmo pacote ele nao pode acessado
						// fora do pacoite

	// atributo da class

	private String modelo;     //objetos
	private int litroDeOleo;
	private int tamanhoDoPneu; // Caracteristricas 

	public Carro(String modelo, int litroDeOleo, int tamanhoDoPneu) { // alt + shift "S" criar uma classe sem retorno
		super();
		this.modelo = modelo;
		this.litroDeOleo = litroDeOleo;
		this.tamanhoDoPneu = tamanhoDoPneu;
	}

	public String getModelo() {
		return modelo;
	}



	public int getLitroDeOleo() {
		return litroDeOleo;
	}



	public int getTamanhoDoPneu() {
		return tamanhoDoPneu;
	}

	
	
	

}
