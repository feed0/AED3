package A_Reviewing;

public class Company {
    private final int capacity;
    private final Employee[] employees;
    private int len;

    // construtor
    /**
     * Cria uma empresa com 100 vagas para funcionarios.
     */
    public Company() {
        this.capacity = 100;
        this.employees = new Employee[capacity];
        this.len = 0;
    }

    // methods
    /**
     * Caso haja espaco, adiciona um funcionario logo apos o ultimo. <br>
     * Entao, incrementa o atributo comprimento.
     *
     * @param func nome do novo funcionario.
     */
    public void add(Employee func) {
        if (!isFull()) {
            employees[len] = func;
            len++;
        }
    }

    /**
     * Procurar por um funcionario com base em uma dada posicao.
     * @param posicao indice do funcionario.
     * @return funcionario na posicao dada.
     */
    public Employee get(int posicao) {
        try {
            return employees[posicao];
        }
        catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println(aiob);
            return null;
        }
    }

    /**
     * Compara o elemento na posicao dada com o objeto nulo.
     * @param posicao indice da procura.
     * @return true se o elemento nao for nulo.
     * @exception IndexOutOfBoundsException false se a posicao fornecida for maior que a capacidade.
     */
    private boolean isOccupied(int posicao) {
        try {
            return employees[posicao] != null;
        }
        catch (IndexOutOfBoundsException iob) {
            System.out.println(iob);
            return false;
        }
    }

    /**
     * Remove um funcionario na posicao fornecida.
     * @param posicao indice do funcionario na lista.
     * @return objeto do funcionario removido.
     * @exception IndexOutOfBoundsException já é tratada na primeira linha com outro método.
     */
    public Employee remove(int posicao) {
        if (isOccupied(posicao)) {
            // guarda o funcionario a ser removido
            Employee removido = employees[posicao];

            // se a posicao nao for a ultima ocupada no vetor, passa pelo loop.
            if (posicao < len -1)
                // reescreve todos os elementos num indice a menos.
                for (int i = posicao; employees[i] != null; i++)
                    employees[i] = employees[i+1];

            // finalmente remove o ultimo funcionario
            employees[len] = null;

            // reduz o comprimento
            len--;
            return removido;
        }
        return null;
    }

    /**
     * Procura por um nome de funcionario.
     *
     * @param nome funcionario buscado.
     * @return true se existir qualquer ocorrencia.
     */
    public boolean contains(String nome) {
        for (int i = 0; employees[i] != null; i++)
            if (employees[i].getName().equalsIgnoreCase(nome))
                return true;
        return false;
    }

    /**
     * Itera pela lista contando elementos nao nulos.
     *
     * @return numero de elementos.
     */
    public int size() {
        return len;
    }

    /**
     *Itera pelo array imprimindo cada objeto.
     */
    public void print() {
        for (int i = 0; employees[i] != null; i++)
            System.out.printf("[%d] %s%n",i, employees[i]);
    }

    /**
     * Usa metodo de insercao para ordenar alfabeticamente
     */
    public void sortByName() {
        for (int i = 1; i< len; i++) {
            int pointer = i;
            while (pointer > 0 && employees[pointer-1].getName().compareTo(employees[pointer].getName()) > 0) {
                Employee temp = employees[pointer-1];
                employees[pointer-1] = employees[pointer];
                employees[pointer] = temp;
                pointer--;
            }
        }
    }

    /**
     * Compara o comprimento atual com a capacidade total.
     * @return true se iguais.

     */
    public boolean isFull() {
        return len == capacity;
    }
}