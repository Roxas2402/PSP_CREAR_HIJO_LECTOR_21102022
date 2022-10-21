import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String ficheroNombre = sc.nextLine();

        File fichero = new File(ficheroNombre);

        if (fichero.exists()) {

        } else {
            throw new FileNotFoundException();
        }
    }
}