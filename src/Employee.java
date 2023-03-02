public class Employee {
    private String name;
    private double salary;

    // get set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // construtor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // metodos
    public String toString() {
        return String.format("""
                (Name: %s, Salary: %.2f)""",
                name, salary);
    }
}
