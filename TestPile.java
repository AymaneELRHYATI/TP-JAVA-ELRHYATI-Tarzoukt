import java.util.Scanner;

public class TestPile {

    public static void main(String[] args) {
        System.out.println("Entrez une chaîne de caractères (# pour terminer) : ");
        String chaine = lireChaine();

        System.out.println("Chaîne inversée : " + invChaine(chaine));

        System.out.println("\nEntrez un texte avec des parenthèses (# pour terminer) : ");
        String texte = lireChaine();

        if (verifierParentheses(texte)) {
            System.out.println("bien parenthésée.");
        } else {
            System.out.println("erreur");
        }
    }

    private static String invChaine(String chaine) {
        Pile pile = new Pile();

        for (int i = 0; i < chaine.length(); i++) {
            pile.empiler(chaine.charAt(i));
        }

        StringBuilder chaineInverse = new StringBuilder();
        while (!pile.estVide()) {
            chaineInverse.append(pile.sommet());
            pile.depiler();
        }

        return chaineInverse.toString();
    }

    private static boolean verifierParentheses(String texte) {
        Pile pile = new Pile();

        for (int i = 0; i < texte.length(); i++) {
            char caractere = texte.charAt(i);

            if (caractere == '(') {
                pile.empiler(caractere);
            } else if (caractere == ')') {
                if (!pile.estVide()) {
                    pile.depiler();
                } else {
                    return false;
                }
            }
        }

        return pile.estVide();
    }

    private static String lireChaine() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        char caractere;
    
        try {
            while (scanner.hasNext()) {
                caractere = scanner.next().charAt(0);
                if (caractere != '#') {
                    builder.append(caractere);
                } else {
                    break; 
                }
            }
        } finally {
            scanner.close(); 
        }
    
        return builder.toString();
    }
    
}
