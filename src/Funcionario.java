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

    // constructor
    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // methods
    public String toString() {
        return String.format("""
                Nome = %s
                Salario = %.2f""", nome, salario);
    }

    public class Lista {
        private int capacidade = 100;
        private Funcionario[] lista = new Funcionario[capacidade];

        // methods
        /**
         * Adds a new element to the first null space.
         *
         * @param func
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

        private boolean posicaoOcupada(int posicao) {
            return lista[posicao] == null;
        }

        public void remove(int posicao) {
            if (posicaoOcupada(posicao))
                lista[posicao] = null;
        }

        /**
         * Returns true if there's any occurrences of the given element.
         *
         * @param nome
         * @return
         */
        public boolean contem(String nome) {
            for (int i = 0; i < capacidade; i++)
                if (lista[i].getNome() == nome)
                    return true;
            return false;
        }

        /**
         * Runs linearly through the array counting non-null elements
         *
         * @return
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

        public void ordenaPorNome() {
        }
    }
}
