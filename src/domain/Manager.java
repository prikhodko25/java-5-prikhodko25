package domain;

/**
 * The class Manager extends employee
 */
public class Manager extends Employee {

    /**
     *
     * Manager
     *
     * @param employees the employees.
     * @param name      the name.
     * @param jobTitle  the job title.
     * @param level     the level.
     * @param dept      the dept.
     * @return public
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {

        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override

    /**
     *
     * To string
     *
     * @return String
     */
    public String toString() {

        return super.toString() + "\nEmployees: " + getEmployees();
    }

    /**
     *
     * Manager
     *
     * @param employees the employees.
     * @return public
     */
    public Manager(Employee[] employees) {

        super();
        this.employees = employees;
    }

    /**
     *
     * Manager
     *
     * @return public
     */
    public Manager() {

        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     *
     * Gets the employees
     *
     * @return the employees
     */
    public String getEmployees() {

        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     *
     * Sets the employees
     *
     * @param employees the employees.
     */
    public void setEmployees(Employee[] employees) {

        this.employees = employees;
    }

    /**
     *
     * Gets the employees list
     *
     * @return the employees list
     */
    public Employee[] getEmployeesList() {

        return employees;
    }

}
