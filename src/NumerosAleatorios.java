import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        mostrarNumerosAleatorios();
    }

    public static void mostrarNumerosAleatorios() {
        Random random = new Random();

        System.out.println("30 números aleatorios entre 1 y 10:");

        for (int i = 0; i < 30; i++) {
            int numeroAleatorio = random.nextInt(10) + 1;
            System.out.print(numeroAleatorio + " ");
        }
    }
}