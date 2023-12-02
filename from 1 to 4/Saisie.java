import java.util.Scanner;

class Saisie {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Donner un entier: ");
        int n = clavier.nextInt();
        System.out.println(n*2);
    }    
}
