import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\lista_funcionarios.txt");
        Scanner scan = new Scanner(file);

        Empresa empresa = new Empresa();
        // todo Cadastre o nome e o salário de 5 funcionários
        // todo liste todos os dados dos funcionários

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }

    }
}

