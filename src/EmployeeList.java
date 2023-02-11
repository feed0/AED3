public class EmployeeList {
    private int len = 100;
    private Employee[] list = new Employee[len];
// methods

    /**
     * Adds a new element to the first null space.
     *
     * @param toAdd
     */
    public void add(Employee toAdd) {
        for (int i = 0; i < len; i++) {
            if (list[i] == null)
                list[i] = toAdd;
        }
    }

    public Employee get(int atIndex) {
        return list[atIndex];
    }

    private boolean isOccupied(int atIndex) {
        return list[atIndex] == null;
    }

    public void remove(int atIndex) {
        if (isOccupied(atIndex))
            list[atIndex] = null;
    }

    /**
     * Returns true if there's any occurrences of the given element.
     *
     * @param toCompare
     * @return
     */
    public boolean contains(String toCompare) {
        for (int i = 0; i < len; i++)
            if (list[i].getName() == toCompare)
                return true;
        return false;
    }

    /**
     * Runs linearly through the array counting non-null elements
     *
     * @return
     */
    public int length() {
        int out = 0;
        for (Employee e : list)
            if (e != null)
                out++;
        return out;
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
        for (Employee e: list)
            if (e != null)
                out.append(e.toString());
        return out.toString();
    }

    public void sortByName() {
    }
}
