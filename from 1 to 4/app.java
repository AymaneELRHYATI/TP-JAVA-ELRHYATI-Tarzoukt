import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class moncls {
    public static void main(String[] args) {
        System.out.println("Bonjour, ca va ?");
        try (PrintWriter writer = new PrintWriter(new FileWriter("resultat.txt"))) {
            writer.println("Bonjour, ça va ?");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
