import java.util.Scanner;

class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}

public class Pr7 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}

/*
Output:
Enter employee name: John
Enter employee salary: 50000
Employee Name: John
Employee Salary: 50000.0
*/
