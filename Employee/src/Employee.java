public class Employee {
    // Fields
    private String name;
    private int idNumber;
    private String department;
    private String position;
    private double salary;

    // Constructor that accepts all fields as arguments
    public Employee(String name, int idNumber, String department, String position, double salary) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
        setSalary(salary);
    }

    // Constructor that accepts name and ID number, with default values for department, position, and salary
    public Employee(String name, int idNumber) {
        this(name, idNumber, "", "", 0.0);
    }

    // No-arg constructor
    public Employee() {
        this("", 0, "", "", 0.0);
    }

    // Mutator (Setter) methods
    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        // Salary validation (must be between 0 and 90,000 inclusive)
        if (salary >= 0 && salary <= 90000) {
            this.salary = salary;
        } else {
            this.salary = 0.0; 
        }
    }

    // Accessor (Getter) methods
    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    // Override toString method to display employee information
    @Override
    public String toString() {
        return "Employee Name: " + name +
                "\nID Number: " + idNumber +
                "\nDepartment: " + department +
                "\nPosition: " + position +
                "\nSalary: $" + salary;
    }
}
