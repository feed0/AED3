import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\lista_funcionarios.txt");
        Scanner scan = new Scanner(file);
        Empresa empresa = new Empresa();

        System.out.println("___ ADICIONA ___");
        for (int i=0; scan.hasNextLine(); i++) {
            String[] func = scan.nextLine().split(",");
            empresa.adiciona(new Funcionario(func[0], Double.parseDouble(func[1])));
            System.out.println(String.format("+ [%d} ", i) + empresa.busca(i));
        }

        System.out.println("___ CONTEM ___");
        String[] contems = {"Andre Antunes", "Nome Invalido"};
        for (String nome : contems)
            System.out.println(empresa.contem(nome) +" "+ nome);

        System.out.println("___ BUSCA ___");
        int[] buscas = {3,10,1000};
        for (int i : buscas)
            System.out.println(String.format("[%d]: ", i) + empresa.busca(i));

        System.out.println("___ ORDENADO ___");
        empresa.ordenaPorNome();
        empresa.imprime();

        System.out.println("___ REMOVE ___");
        int[] remocoes = {2,10,1000};
        for (int i : remocoes) {
            Funcionario removido = empresa.remove(i);
            System.out.println(String.format("- [%d] ", i) + removido);
        }

        System.out.println("___ FIM ___");
        empresa.imprime();
    }
}

