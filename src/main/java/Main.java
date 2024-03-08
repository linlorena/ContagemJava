import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números de entrada: ");
        int N = scanner.nextInt();

        System.out.print("Digite o primeiro dado: ");
        int primeiroDado = scanner.nextInt();

        int contador = 0;
        for (int i = primeiroDado; i <= N; i++) {
            contador++;
        }

        System.out.println("Quantidade de valores inteiros entre " + primeiroDado + " e " + N + " é " + contador);

        scanner.close();
    }
}