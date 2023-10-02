import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Double> mano = new Stack<>();
        double suma = 0.0;

        System.out.println("¡Bienvenido al juego 7 y Medio!");

        while (true) {
            System.out.println("Carta actual: " + suma);
            System.out.println("¿Desea tomar otra carta? (s/n): ");
            char respuesta = scanner.next().charAt(0);

            if (respuesta == 'n') {
                break;
            }

            double carta = Math.random() * 7.5; // Genera una carta aleatoria de 0 a 7.5
            mano.push(carta);
            suma += carta;

            if (suma > 7.5) {
                System.out.println("¡Te has pasado de 7.5! Has perdido.");
                break;
            }
        }

        System.out.println("Tu mano: " + mano);
        System.out.println("Total: " + suma);

        scanner.close();
    }
}