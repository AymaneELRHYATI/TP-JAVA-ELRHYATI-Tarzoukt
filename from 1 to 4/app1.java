class DeuxiemeExemple {
    public static void main(String[] args) {
        // Vérifier si un argument (MonPrenom) est passé en ligne de commande
        if (args.length > 0) {
            // Imprimer "Bonjour" suivi du prénom passé en argument
            System.out.println("Bonjour " + args[0] + ".");
        } else {
            System.out.println("Veuillez fournir un prénom en ligne de commande.");
        }
    }
}
