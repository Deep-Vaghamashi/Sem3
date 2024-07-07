import java.util.Scanner;

class Employee_Detail {
    int Employee_ID;
    String Name;
    String Designation;
    double Salary;
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee_Detail employee = new Employee_Detail();

        System.out.print("Enter Employee ID: ");
        employee.Employee_ID = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Name: ");
        employee.Name = scanner.nextLine();

        System.out.print("Enter Designation: ");
        employee.Designation = scanner.nextLine();

        System.out.print("Enter Salary: ");
        employee.Salary = scanner.nextDouble();

        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employee.Employee_ID);
        System.out.println("Name: " + employee.Name);
        System.out.println("Designation: " + employee.Designation);
        System.out.println("Salary: " + employee.Salary);

        scanner.close();
    }
}
