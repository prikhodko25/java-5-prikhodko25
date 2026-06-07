package domain;

/**
 * The class Employee
 */
public class Employee {

    @Override

    /**
     *
     * To string
     *
     * @return String
     */
    public String toString() {

        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= "
                + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

    // private static int employeesCount = 0;

    /**
     *
     * It is a constructor.
     *
     * @param name     the name.
     * @param jobTitle the job title.
     * @param level    the level.
     * @param dept     the dept.
     */
    public Employee(String name, String jobTitle, int level, String dept) {

        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     *
     * It is a constructor.
     *
     */
    public Employee() {

        ID = (int) (Math.random() * 1000);
        // if (ID > 10000) {
        // throw new NumberFormatException("ERROR! Employee's ID cannot be greater than
        // 10000. Employee is not created!");
        // }
    }

    /**
     *
     * Sets the job title
     *
     * @param job the job.
     */
    public void setJobTitle(String job) {

        jobTitle = job;
    }

    /**
     *
     * Gets the job title
     *
     * @return the job title
     */
    public String getJobTitle() {

        return jobTitle;
    }

    /**
     *
     * Gets the name
     *
     * @return the name
     */
    public String getName() {

        return name;
    }

    /**
     *
     * Sets the level
     *
     * @param level the level.
     */
    public void setLevel(int level) {

        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     *
     * Gets the level
     *
     * @return the level
     */
    public int getLevel() {

        return level;
    }

    /**
     *
     * Gets the dept
     *
     * @return the dept
     */
    public String getDept() {

        return dept;
    }

    /**
     *
     * Sets the dept
     *
     * @param dept the dept.
     */
    public void setDept(String dept) {

        this.dept = dept;
    }

    /**
     *
     * Sets the name
     *
     * @param name the name.
     */
    public void setName(String name) {

        // boolean correctName = true;
        // for (int i = 0; i < name.length(); i++) {
        // char s = name.charAt(i);
        // if (Character.isDigit(s)) {
        // correctName = false;
        // }
        // }
        // if (correctName) {
        // this.name = name;
        // } else {
        // this.name = "John Doe";
        // }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
