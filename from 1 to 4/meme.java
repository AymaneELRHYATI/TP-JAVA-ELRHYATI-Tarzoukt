import java.util.Scanner;

class meme {
    public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    int age;
    String nom;
    double taille;
    System.out.format("Quelle est votre nom?: ");
    nom = clavier.nextLine();
    System.out.format("Quel est votre age?: ");
    age = clavier.nextInt();
    System.out.format("Quelle est votre taille?: ");
    taille = clavier.nextDouble();
    System.out.format("Bonjour %s %nVous avez %d and", nom,age);
    System.out.format(" et vous mesurez %f metres %n",taille);
    }
}
