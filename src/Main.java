import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\lista_funcionarios.txt");
        Scanner scan = new Scanner(file);
        Company company = new Company();

        System.out.println("___ ADICIONA ___");
        for (int i=0; scan.hasNextLine(); i++) {
            String[] func = scan.nextLine().split(",");
            company.add(new Employee(func[0], Double.parseDouble(func[1])));
            System.out.println(String.format("+ [%d} ", i) + company.get(i));
        }

        System.out.println("___ CONTEM ___");
        String[] contems = {"Andre Antunes", "Nome Invalido"};
        for (String nome : contems)
            System.out.println(company.contains(nome) +" "+ nome);

        System.out.println("___ BUSCA ___");
        int[] buscas = {3,10,1000};
        for (int i : buscas)
            System.out.println(String.format("[%d]: ", i) + company.get(i));

        System.out.println("___ ORDENADO ___");
        company.sortByName();
        company.print();

        System.out.println("___ REMOVE ___");
        int[] remocoes = {2,10,1000};
        for (int i : remocoes) {
            Employee removido = company.remove(i);
            System.out.println(String.format("- [%d] ", i) + removido);
        }

        System.out.println("___ FIM ___");
        company.print();

        scan.close();
    }
}

