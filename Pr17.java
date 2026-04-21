interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Pr17 {
    public static void main(String[] args) {
        Result r = new Result();

        int mark = 65;
        double avg = 72.5;

        System.out.println("Is Passed: " + r.isPassed(mark));
        System.out.println("Division: " + r.getDivision(avg));

        System.out.println("\nMark: 35");
        System.out.println("Is Passed: " + r.isPassed(35));
        System.out.println("Division: " + r.getDivision(35));
    }
}

/*
Output:
Is Passed: true
Division: First Division

Mark: 35
Is Passed: false
Division: Fail
*/
