public class Employee {
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
// constructor
    public Employee(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }
// methods
}
