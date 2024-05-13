import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner leer = new Scanner(System.in);
        int[] numeros = new int [10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite los numeros. " + (i + 1) + ": ");
            numeros[i] = leer.nextInt();
        }
        System.out.println("Numeros en Orden inverso: ");
        for (int i = 9; i >= 0; i--) { 
            System.out.println((i + 1) + ": " + numeros[i]);
        }
        leer.close();
    }
}