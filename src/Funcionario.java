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
}
