public class ParOuImpar {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 10, 15, 20, 25, 30};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " é par");
            } else {
                System.out.println(numeros[i] + " é ímpar");
            }
        }
    }
}