import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\lista_funcionarios.txt");
        Scanner scan = new Scanner(file);

        Empresa empresa = new Empresa();
        // todo ( ) Cadastre o nome e o salário de 5 funcionários
        // todo ( ) liste todos os dados dos funcionários

        /*while (scan.hasNextLine()) {
            // todo ( ) study split method
            // todo ( ) java args* and kwargs**
            // todo ( ) java *list
            // todo ( ) java Pair (tuple)
            String[] func = scan.nextLine().split(",");
            System.out.println(func[0] + func[1]);
            empresa.adiciona(new Funcionario(func[0], Double.parseDouble(func[1])));
        }*/
        empresa.adiciona(new Funcionario("aaa", 123));
        empresa.imprime();
    }
}

