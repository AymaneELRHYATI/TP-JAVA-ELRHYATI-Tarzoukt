import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        int nombre1, nombre2, resultat;
        char operation;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        nombre1 = scanner.nextInt();

        System.out.print("Entrez l'opération (+, -, x, /) : ");
        operation = scanner.next().charAt(0);

        System.out.print("Entrez le deuxième nombre : ");
        nombre2 = scanner.nextInt();

        switch (operation) {
            case '+':
                resultat = nombre1 + nombre2;
                System.out.println("Résultat : " + resultat);
                break;
            case '-':
                resultat = nombre1 - nombre2;
                System.out.println("Résultat : " + resultat);
                break;
            case 'x':
                resultat = nombre1 * nombre2;
                System.out.println("Résultat : " + resultat);
                break;
            case '/':
                if (nombre2 != 0) {
                    resultat = nombre1 / nombre2;
                    System.out.println("Résultat : " + resultat);
                } else {
                    System.out.println("Erreur : Division par zéro !");
                }
                break;
            default:
                System.out.println("Opération non valide.");
        }

        scanner.close();
    }
}
