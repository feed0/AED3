public class EmployeeList {
    private int len = 100;
    private Employee[] vetor = new Employee[len];
// methods
    public void add(Employee func) {
        for (int i = 0; i < len; i++) {
            if (vetor[i] == null)
                vetor[i] = func;
        }
    }

    public Employee search(int posicao) {}
    private boolean isOccupied(int posicao) {}
    public void remove(int posicao) {}
    public boolean contains(String nome) {}
    public int length() {}
    public String toString() {}
    public void sortByName() {}
}
