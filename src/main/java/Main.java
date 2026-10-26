import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość liczby a: ");
        double a = scanner.nextDouble();

        System.out.println("Podaj wartość liczby b: ");
        double b = scanner.nextDouble();

        double suma = a + b;
        System.out.println("Suma podanych liczb to: " +suma);
        scanner.close();
    }
}
