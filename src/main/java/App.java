import java.util.List;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        EmployeeDb database = new EmployeeDb();
        EmployeeUi ui = new EmployeeUi();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            ui.selectActions();
            int choice = scanner.nextInt();
            System.out.println();
            if (choice == 1) {
                // write code to add employee
                System.out.print("Enter employee id: ");
                int id = scanner.nextInt();
                System.out.print("Enter employee name: ");
                String name = scanner.next();
                System.out.print("Enter employee salary: ");
                double salary = scanner.nextDouble();
                System.out.print("Enter employee job title: ");
                String jobTitle = scanner.next();
                System.out.print("Enter employee department: ");
                String department = scanner.next();
                Employee employee = new Employee(id, name, salary, jobTitle, department);
                if (salary < 0 || salary > 1000000) {
                    System.out.println("Invalid Salary!");
                    break;
                }
                if (id < 0 || id > 100000) {
                    System.out.println("Invalid ID!");
                    break;
                }
                if (name.length() == 0 || name.length() > 50) {
                    System.out.println("Names Should be Less Than 50 Characters");
                    break;
                }
                if (jobTitle.length() == 0 || jobTitle.length() > 50) {
                    System.out.println("JobTitle Should be Less Than 50 Characters");
                    break;
                }
                if (department.length() == 0 || department.length() > 50) {
                    System.out.println("Deapartment Should be Less Than 50 Characters");
                    break;
                }
                database.addEmployee(employee);
                System.out.println();
                System.out.println("************Employee added successfully************");
                System.out.println();

            } else if (choice == 2) {
                // write code to remove employee
                System.out.print("Enter employee id: ");
                int id = scanner.nextInt();
                if (id < 0 || id > 100000) {
                    System.out.println("Invalid ID!");
                    break;
                }
                database.removeEmployee(id);
                System.out.println();
                System.out.println("************Employee removed successfully************");
                System.out.println();
            } else if (choice == 3) {
                // write code to get employee by id
                System.out.print("Enter employee id: ");
                int id = scanner.nextInt();
                if (id < 0 || id > 100000) {
                    System.out.println("Invalid ID!");
                    break;
                }
                Employee employee = database.getEmployeeById(id);
                if (employee != null) {
                    System.out.println(employee.getId());
                    System.out.println(employee.getName());
                    System.out.println(employee.getSalary());
                    System.out.println(employee.getJobTitle());
                    System.out.println(employee.getDepartment());
                } else {
                    System.out.println("Employee not found.");
                }
                System.out.println();
            } else if (choice == 4) {
                // write code to display all employees
                List<Employee> employees = database.getEmployees();
                System.out.println("Id\tName\tSalary\tJob Title\tDepartment");
                if (employees.size() > 0) {
                    for (int i = 0; i < employees.size(); i++) {
                        System.out.println(employees.get(i).getId() + "\t" + employees.get(i).getName() + "\t"
                                + employees.get(i).getSalary() + "\t" + employees.get(i).getJobTitle() + "\t\t"
                                + employees.get(i).getDepartment());
                    }
                } else {
                    System.out.println("No employees to display.");
                }
                System.out.println();
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice.");
                System.out.println();
            }
        }
    }

}
