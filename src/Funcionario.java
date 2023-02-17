public class Funcionario {
    private String nome;
    private Float salario;

    // get set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = this.nome;
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

    public class Lista {
        private int capacidade = 100;
        private Funcionario[] lista = new Funcionario[capacidade];

        // construtor
        // todo fix this constructor
        public Lista(int capacidade) {
            this.capacidade = capacidade != 0 : this.capacidade = 0;
        }

        // methods
        // todo I should consider that the array mustn't have any gaps (nulls in between)
        /**
         * Adiciona o novo elemento no primeiro espaco livre.
         *
         * @param func nome do novo funcionario.
         */
        public void adiciona(Funcionario func) {
            for (int i = 0; i < capacidade; i++) {
                if (lista[i] == null)
                    lista[i] = func;
            }
        }

        public Funcionario busca(int posicao) {
            return lista[posicao];
        }

        /**
         * Compara o elemento na posicao dada com o objeto nulo.
         * @param posicao
         * @return true se se o elemento nao for nulo.
         */
        private boolean posicaoOcupada(int posicao) {
            return lista[posicao] != null;
        }

        public void remove(int posicao) {
            if (posicaoOcupada(posicao))
                lista[posicao] = null;
        }

        // todo try using for each instead of using i
        /**
         * Procura por um nome de funcionario.
         *
         * @param nome funcionario buscado.
         * @return true se existir qualquer ocorrencia.
         */
        public boolean contem(String nome) {
            for (int i = 0; i < capacidade; i++)
                if (lista[i].getNome() == nome)
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

        public void imprime() {
            for (Funcionario e : lista)
                if (e != null)
                    System.out.println(e);
        }

        // todo try the insertion method
        public void ordenaPorNome() {
        }
    }
}
