import java.util.Scanner;

public class temp2 {

    public static void main(String[] args) {
        double tc, tf;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la temp en Celsius : ");
        tc = scanner.nextDouble();

        tf = c2f(tc);

        System.out.println("La temp en Fahrenheit est : " + tf);

        scanner.close();
    }
    static double c2f(double c){
        double f = 9./5 * c + 32;
        return f;
    }
}