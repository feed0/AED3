public class Empresa {
    private int capacidade = 100;
    private Funcionario[] lista = new Funcionario[capacidade];
    private int comprimento = 0;

    // construtor
    /**
     * Cria uma lista com 100 espacos.
     */
    public Empresa() {

        //this.capacidade = 100;
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
     * @return objeto do funcionario removido.
     */
    public Funcionario remove(int posicao) {
        if (posicaoOcupada(posicao)) {
            // guarda o funcionario a ser removido
            Funcionario removido = lista[posicao];

            // se a posicao nao for a ultima ocupada no vetor, passa pelo loop.
            if (posicao < comprimento-1)
                // reescreve todos os elementos num indice a menos.
                for (int i=posicao; lista[i] != null; i++)
                    lista[i] = lista[i+1];

            // finalmente remove o ultimo funcionario
            lista[comprimento] = null;

            // reduz o comprimento
            comprimento--;
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