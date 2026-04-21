import java.util.Scanner;

class College {
    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        String studentName;
        String course;

        void readData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            studentName = sc.nextLine();
            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        void displayData() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

public class Pr11 {
    public static void main(String[] args) {
        College c = new College("ABC College");
        College.Admission a = c.new Admission();

        a.readData();
        a.displayData();
    }
}

/*
Output:
Enter student name: John
Enter course: BCA
College Name: ABC College
Student Name: John
Course: BCA
*/
