import java.util.Scanner;

public class temp1 {

    public static void main(String[] args) {
        double tc, tf;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la temp en Celsius : ");
        tc = scanner.nextDouble();

        tf = (9.0 / 5.0) * tc + 32;

        System.out.println("La temp en Fahrenheit est : " + tf);

        scanner.close();
    }
}
