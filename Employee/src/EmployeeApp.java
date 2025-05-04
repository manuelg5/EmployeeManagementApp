public class EmployeeApp {
    public static void main(String[] args) {
        // Five Employee objects with the provided data
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "VP", 89000);
        Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer", 67000);
        Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer", 66000);
        Employee emp4 = new Employee("John Doe", 55555, "Sales", "Representative", -35000); // Invalid salary
        Employee emp5 = new Employee("James Blue", 44444, "IT", "CTO", 123000); // Invalid salary

        // Display employee data
        System.out.println(emp1);
        System.out.println();
        System.out.println(emp2);
        System.out.println();
        System.out.println(emp3);
        System.out.println();
        System.out.println(emp4);
        System.out.println();
        System.out.println(emp5);
    }
}
