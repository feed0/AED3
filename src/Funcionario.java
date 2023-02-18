public class Funcionario {
    private String nome;
    private Float salario;

    // get set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    // construtor
    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // metodos
    public String toString() {
        return String.format("""
                Nome = %s
                Salario = %.2f""", nome, salario);
    }

    // Lista
    public static class Lista {
        private int capacidade;

        private int comprimento = 0;
        private Funcionario[] lista = new Funcionario[capacidade];

        // construtor
        /**
         * Cria uma lista com 100 espacos.
         */
        public Lista() {
            this.capacidade = 100;
        }

        // methods
        /**
         * Caso haja espaco, adiciona um funcionario logo apos o ultimo. <br>
         * Entao, incrementa o atributo comprimento.
         *
         * @param func nome do novo funcionario.
         */
        public void adiciona(Funcionario func) {
            if (comprimento < capacidade) {
                lista[comprimento + 1] = func;
                comprimento++;
            }
        }

        /**
         * Procurar por um funcionario com base em uma dada posicao.
         * @param posicao indice do funcionario.
         * @return funcionario na posicao dada.
         */
        public Funcionario busca(int posicao) {
            return lista[posicao];
        }

        /**
         * Compara o elemento na posicao dada com o objeto nulo.
         * @param posicao indice da procura.
         * @return true se o elemento nao for nulo.
         */
        private boolean posicaoOcupada(int posicao) {
            try {
                return lista[posicao] != null;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                System.out.println(indexOutOfBoundsException
                        + "A posição '" + posicao + "' é maior que a capacidade da lista [" + capacidade + "].");
                return false;
            }
        }

        /**
         * Remove um funcionario na posicao fornecida.
         * @param posicao indice do funcionario na lista.
         */
        // todo prevent outOfBound indexes
        public void remove(int posicao) {
            if (posicaoOcupada(posicao))
                lista[posicao] = null;
        }

        /**
         * Procura por um nome de funcionario.
         *
         * @param nome funcionario buscado.
         * @return true se existir qualquer ocorrencia.
         */
        public boolean contem(String nome) {
            for (int i=0; i<=comprimento; i++)
                if (lista[i].getNome().equalsIgnoreCase(nome))
                    return true;
            return false;
        }

        // todo add the length atribute to avoid iterating
        /**
         * Itera pela lista contando elementos nao nulos.
         *
         * @return numero de elementos.
         */
        public int tamanho() {
            int saida = 0;
            for (Funcionario e : lista)
                if (e != null)
                    saida++;
            return saida;
        }

        /**
         *
         */
        public void imprime() {
            for (Funcionario e : lista)
                if (e != null)
                    System.out.println(e);
        }

        // todo try the insertion method
        public void ordenaPorNome() {
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int e : a)
            System.out.println(e);
    }
}
