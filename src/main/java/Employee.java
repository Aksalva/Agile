class Employee {
    private int id;
    private String name;
    private double salary;
    private String jobTitle;
    private String department;

    public Employee(int id, String name, double salary, String jobTitle, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
