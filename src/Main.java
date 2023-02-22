import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\lista_funcionarios.txt");
        Scanner scan = new Scanner(file);
        Empresa empresa = new Empresa();

        while (scan.hasNextLine()) {
            String[] func = scan.nextLine().split(",");
            empresa.adiciona(new Funcionario(func[0], Double.parseDouble(func[1])));
        }

        empresa.imprime();

//        System.out.printf("%b\n%b",
//                empresa.contem("Andre Antunes"),
//                empresa.contem("Inexistente")
//        );

        System.out.printf("%s\n%s\n%s\n",
                empresa.busca(3),
                empresa.busca(10),
                empresa.busca(1000)
        );

        System.out.println("\n_______----__\n");


//        empresa.ordenaPorNome();
//        empresa.imprime();
//
//        empresa.remove(2);
//        empresa.remove(10);
//        empresa.remove(1000);
    }
}

