import java.util.Scanner;


class cnv{
    public static double c2f(double c){
        return (9.0/5.0) * c + 32;
    }
}

public class temp3 {

    public static void main(String[] args) {
        double tc, tf;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la temp en Celsius : ");
        tc = scanner.nextDouble();

        tf = cnv.c2f(tc);

        System.out.println("La temp en Fahrenheit est : " + tf);

        scanner.close();
    }
}

