public class Employee {
    private String name;
    private Float salary;
// get set
    public String getName() {
        return name;
    }
    public void setName(String nome) {
        this.name = name;
    }
    public Float getSalary() {
        return salary;
    }
    public void setSalary(Float salary) {
        this.salary = salary;
    }
// constructor
    public Employee(String nome, Float salary) {
        this.name = nome;
        this.salary = salary;
    }
// methods
    public String toString() {
        return String.format("""
                Name = %s
                Salary = %.2f""", name, salary);
    }
}
