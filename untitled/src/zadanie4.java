
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podać liczbę wierszy");
        int wiersze = scanner.nextInt();

        System.out.println("Proszę podać liczbę kolumn");
        int kolumny = scanner.nextInt();

        System.out.println("==============================");

        for (int i = 1; i <= wiersze; i++) {
            for (int j = 1; j <= kolumny; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
