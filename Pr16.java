interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Second Division";
        }
    }
}

public class Pr16 {
    public static void main(String[] args) {
        Result r = new Result();

        System.out.println("Division: " + r.getDivision(75));
        System.out.println("Division: " + r.getDivision(55));
    }
}

/*
Output:
Division: First Division
Division: Second Division
*/
