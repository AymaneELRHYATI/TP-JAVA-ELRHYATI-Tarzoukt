import java.util.*;

class sai {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int age;
        String nom;
        double taille;
        System.out.println("Quelle est votre nom?: ");
        nom = clavier.nextLine();
        System.out.println("Quel est votre age?: ");
        age = clavier.nextInt();
        System.out.println("Quelle est votre taille?: ");
        taille = clavier.nextDouble();
        System.out.println("Bonjour "+nom);
        System.out.println("Vous avez "+age+" ans");
        System.out.println(" et vous mesurer "+taille+" metres");
    }
}
