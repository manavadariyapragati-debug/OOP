class Employee {
    String name = "John";
    String department = "HR";

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize = 5;
    String project = "Project A";

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

public class Pr15 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        e.displayDetails();
        System.out.println();
        m.displayDetails();
    }
}

/*
Output:
Name: John
Department: HR

Name: John
Department: HR
Team Size: 5
Project: Project A
*/
