
public class Teste {

	public static void main(String[] args) {

		int numero = 6;

		if (numero == 2) {
			System.out.println(" esse e o numero " + numero);

		} else {
			System.out.println(" nao e o numero 2" + numero);
		}

		for (int contador = 0; contador <= 10; contador++) {

			System.out.println("colocando um numero " + contador);
		}

		int diaDaSemana = 1;
		switch (diaDaSemana) {

		case 1:
			System.out.println("domingo");
			break;

		case 2:
			System.out.println("segunda");
			
			
		case 3:
			System.out.println("Terca feira");
			break;

		default:
			System.out.println("outro dia da semana");
			break;
		}

	}

}
